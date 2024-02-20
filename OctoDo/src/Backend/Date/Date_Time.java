package Backend.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_Time {

    private static DateTimeFormatter formatter;

    public static LocalTime getTime(String time) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        return LocalTime.parse(time, inputFormatter);
    }

    public static String printTime(String text) {
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.parse(text, Formatter);

        return time.format(Formatter);
    }

    public static LocalDate getDate(String date) {
        formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.parse(date, formatter);
    }

    
 

    public static String getCurrentTime() {
        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        return timeFormat.format(currentDate);
    }

    public static String getCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(currentDate);
    }

    public static String getCurrentDay() {
        Date currentDate = new Date();
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        return dayOfTheWeekFormat.format(currentDate);
    }

    public static String getCurrentClock() {
        Date currentDate = new Date();
        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        return clockFormat.format(currentDate);
    }
     
    public static void updateTimeEverySecond() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");

        while (true) {
            Date currentTime = new Date();
            System.out.println("Current Time: " + timeFormat.format(currentTime));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void decreaseStopwatch(int durationInMinutes) {

        int durationInSeconds = durationInMinutes * 60;

        System.out.println("Stopwatch started for " + durationInMinutes + " minutes...");

        for (int i = 0; i < durationInSeconds; i++) {

            int remainingMinutes = (durationInSeconds - i) / 60;

            int remainingSeconds = (durationInSeconds - i) % 60;

            System.out.printf("Time remaining: %02d:%02d\n", remainingMinutes, remainingSeconds);

            try {
                Thread.sleep(1000); // Sleep for 1000 mlisecond = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Stopwatch stopped after " + durationInMinutes + " minutes.");
    }

    public static void increaseStopwatch2(int durationInMinutes) {

        int durationInSeconds = durationInMinutes * 60;

        System.out.println("Stopwatch started...");

        for (int i = 0; i <= durationInSeconds; i++) {

            int elapsedMinutes = i / 60;

            int elapsedSeconds = i % 60;

            System.out.printf("Elapsed time: %02d:%02d\n", elapsedMinutes, elapsedSeconds);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stopwatch stopped after " + durationInMinutes + " minutes.");
    }

}

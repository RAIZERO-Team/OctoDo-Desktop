/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ahmed
 */
public class Date_Time {

    public static Date getDate_Time() {
        return new Date();
    }

    public static String getTime() {
        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        return timeFormat.format(currentDate);
    }

    public static String getDate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(currentDate);
    }

    public static String getDay() {
        Date currentDate = new Date();
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        return dayOfTheWeekFormat.format(currentDate);
    }

    public static String getClock() {
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

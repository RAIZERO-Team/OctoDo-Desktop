package Backend.Medicine;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medicine {

    private String nameOfMedicine;
    private LocalDate reminderTimes;
    private int Dosage = 0;
    private LocalTime time;
    private int Days;
    private LocalDate end_of_duration;
    private LocalTime[] Array = new LocalTime[Dosage];

    public String getNameOfMedicine() {
        return nameOfMedicine;
    }

    public LocalDate getReminderTimes() {
        return reminderTimes;
    }

    public int getDosage() {
        return Dosage;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getDays() {
        return Days;
    }

    public LocalDate getEnd_of_duration() {
        return end_of_duration;
    }

    public LocalTime[] getArray() {
        return Array;
    }

    public void setNameOfMedicine(String nameOfMedicine) {
        this.nameOfMedicine = nameOfMedicine;
    }

    public void setReminderTimes(LocalDate reminderTimes) {
        this.reminderTimes = reminderTimes;
    }

    public void setDosage(int Dosage) {
        this.Dosage = Dosage;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public void setEnd_of_duration(LocalDate end_of_duration) {
        this.end_of_duration = end_of_duration;
    }

    public void setArray(LocalTime[] Array) {
        this.Array = Array;
    }

    public Medicine(String nameOfMedicine, LocalDate reminderTimes, LocalTime time, int Days, LocalDate end_of_duration) {
        this.nameOfMedicine = nameOfMedicine;
        this.reminderTimes = reminderTimes;
        this.time = time;
        this.Days = Days;
        this.end_of_duration = end_of_duration;
    }
}

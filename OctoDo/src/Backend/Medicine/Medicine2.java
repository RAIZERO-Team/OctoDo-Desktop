package Backend.Medicine;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Medicine2 {

    private String nameOfMedicine;
    private String reminderTimes;
    private int Dosage = 0;
    private LocalTime Medicine_Time ;
    private String Days;
    private LocalDate end_of_duration;
//    private LocalTime[] Array = new LocalTime[Dosage];

    public static ArrayList<Medicine2> MedicineList = new ArrayList<>();

    public String getNameOfMedicine() {
        return nameOfMedicine;
    }

    public String getReminderTimes() {
        return reminderTimes;
    }

    public int getDosage() {
        return Dosage;
    }

    public LocalTime getTime() {
        return Medicine_Time;
    }

    public String getDays() {
        return Days;
    }

    public LocalDate getEnd_of_duration() {
        return end_of_duration;
    }

//    public LocalTime[] getArray() {
//        return Array;
//    }

    public void setNameOfMedicine(String nameOfMedicine) {
        this.nameOfMedicine = nameOfMedicine;
    }

    public void setReminderTimes(String reminderTimes) {
        this.reminderTimes = reminderTimes;
    }

    public void setDosage(int Dosage) {
        this.Dosage = Dosage;
    }

    public void setTime(LocalTime Medicine_Time ) {
        this.Medicine_Time = Medicine_Time;
    }

    public void setDays(String Days) {
        this.Days = Days;
    }

    public void setEnd_of_duration(LocalDate end_of_duration) {
        this.end_of_duration = end_of_duration;
    }
//
//    public void setArray(LocalTime[] Array) {
//        this.Array = Array;
//    }

    public Medicine2(String nameOfMedicine, String reminderTimes, LocalTime Medicine_Time, String Days, LocalDate end_of_duration) {
        this.nameOfMedicine = nameOfMedicine;
        this.reminderTimes = reminderTimes;
        this.Medicine_Time = Medicine_Time;
        this.Days = Days;
        this.end_of_duration = end_of_duration;
        MedicineList.add(this);
    }

  
    

}

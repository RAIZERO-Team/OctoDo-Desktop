/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author elmnshawy
 */
public class CompletedTask extends Task{
    public static ArrayList <CompletedTask> CompletedTaskList = new ArrayList <>();
    public CompletedTask(String taskName, String description, LocalTime Reminder_time, LocalDate Reminder_Date) {
        super(taskName, description, Reminder_time, Reminder_Date);
        CompletedTaskList.add(this);
    }
    
}

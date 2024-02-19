/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Task;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author elmnshawy
 */
public class TodayTask extends Task {
    public static ArrayList<TodayTask> TodayTaskList = new ArrayList<>();
    public TodayTask(String taskName, String description, LocalTime Reminder_time) {
        super(taskName, description, Reminder_time);
        TodayTaskList.add(this);
    }
    
    
    
}

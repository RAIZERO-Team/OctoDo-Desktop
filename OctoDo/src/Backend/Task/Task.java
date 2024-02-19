/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author elmnshawy
 */
public abstract class Task {

    private String taskName;
    private String description;
    private LocalTime Reminder_time ;
    private LocalDate Reminder_Date;
    private boolean completed;

    public Task(String taskName, String description, LocalTime Reminder_time) {
        this.taskName = taskName;
        this.description = description;
        this.Reminder_time = Reminder_time;
        this.completed = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getReminder_time() {
        return Reminder_time;
    }

    public void setReminder_time(LocalTime Reminder_time) {
        this.Reminder_time = Reminder_time;
    }

    public LocalDate getReminder_Date() {
        return Reminder_Date;
    }

    public void setReminder_Date(LocalDate Reminder_Date) {
        this.Reminder_Date = Reminder_Date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    
    
    
    

}

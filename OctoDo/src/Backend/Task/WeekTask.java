
package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class WeekTask extends Task{
    public static ArrayList <WeekTask> WeekTaskList = new ArrayList<>();
    public WeekTask(String taskName, String description, LocalTime Reminder_time, LocalDate Reminder_Date) {
        super(taskName, description, Reminder_time, Reminder_Date);
    }
    
    
}


package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TodayTask extends Task {
    public static ArrayList <TodayTask> TodayTaskList = new ArrayList<>();
    public TodayTask(String taskName, String description, LocalTime Reminder_time, LocalDate Reminder_Date) {
        super(taskName, description, Reminder_time, Reminder_Date);
        TodayTaskList.add(this);
    } 
    
}

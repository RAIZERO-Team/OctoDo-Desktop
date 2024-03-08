package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DelayTask extends Task {
    

    public static ArrayList<DelayTask> DelayTaskList = new ArrayList<>();

    public DelayTask(String taskName, String description, LocalTime Reminder_time, LocalDate Reminder_Date) {
        super(taskName, description, Reminder_time, Reminder_Date);
        DelayTaskList.add(this);
    }

}

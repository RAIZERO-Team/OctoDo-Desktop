package Backend.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public abstract class Task {

    private String taskName;
    private String description;
    private LocalTime Reminder_time;
    private LocalDate Reminder_Date;
    private String TaskType;
    private boolean completed;

    public Task(String taskName, String description, LocalTime Reminder_time, LocalDate Reminder_Date) {
        this.taskName = taskName;
        this.description = description;
        this.Reminder_time = Reminder_time;
        this.Reminder_Date = Reminder_Date;

    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public LocalTime getReminder_time() {
        return Reminder_time;
    }

    public LocalDate getReminder_Date() {
        return Reminder_Date;
    }

    public String getTaskType() {
        return TaskType;
    }

    public boolean isCompleted() {
        return completed;
    }

}

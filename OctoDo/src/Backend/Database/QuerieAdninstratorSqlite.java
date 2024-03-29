package Backend.Database;

import static Backend.Database.ConnectionDB.sqlitecon;
import Backend.Task.CompletedTask;
import static Backend.Task.CompletedTask.CompletedTaskList;
import Backend.Task.DelayTask;
import static Backend.Task.DelayTask.DelayTaskList;
import Backend.Task.Task;
import Backend.Task.TodayTask;
import Backend.Task.WeekTask;
import static Backend.Task.WeekTask.WeekTaskList;
import com.sun.jdi.connect.spi.Connection;

import java.sql.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import raven.toast.Notifications;

public class QuerieAdninstratorSqlite {

    static void createTables() throws SQLException {
        // SQL statements to create tables
        String[] tableCreationStatements = {

            "CREATE TABLE IF NOT EXISTS taskType (typeID varchar (30) PRIMARY KEY, typeName varchar(60))",
            "CREATE TABLE IF NOT EXISTS  tasks (task_name VARCHAR(150), descript TEXT , reminder_date DATE , reminder_time TIME , taskType varchar (30) ,  FOREIGN KEY (taskType) REFERENCES taskType(typeID))"

        // Add more table creation statements as needed
        };

        // Execute SQL statements to create tables
        try (Statement statement = sqlitecon.createStatement()) {
            for (String tableCreationStatement : tableCreationStatements) {

                statement.execute(tableCreationStatement);
            }
        }
    }

    static void insertData() throws SQLException {
        String insertSQL = "INSERT INTO taskType VALUES('1980DTA', 'dayTask'), "
                + "('5317WTK', 'weekTask'), "
                + "('1097CTA', 'completedTask'), "
                + "('1801DTKH', 'delayTask')";
        try (PreparedStatement p = sqlitecon.prepareStatement(insertSQL)) {
            p.execute();
        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
    }
    static private PreparedStatement stm = null;

    public static boolean InsertMedicine(String Medicine_Name, String Reminder_Times, String Dosage_ParDay, String Medicine_Time, String Days, String Duration) {
        try {
            stm = sqlitecon.prepareStatement("INSERT INTO Medicine (Medicine_name, reminderTimes,Dosage_ParDay, Medicine_Time, Days , Duration) VALUES (?, ?, ?, ?, ?, ?)");
            stm.setString(1, Medicine_Name);
            stm.setString(2, Reminder_Times);
            stm.setString(3, Dosage_ParDay);
            stm.setString(4, Medicine_Time);
            stm.setString(5, Days);
            stm.setString(6, Duration);

            stm.executeUpdate();
            return true;
        } catch (SQLException e) {

            return false;
        }

    }

    public static boolean DeleteMedicine(String MedicineName) {
        try {
            stm = sqlitecon.prepareStatement("DELETE FROM Medicine WHERE Medicine_Name =?");
            stm.setString(1, MedicineName);
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public static boolean selectAllMedicine() {
        return true; // note : ترجع كل الميديسن بالترتيب علي حسبالتاريخ اولا ثم الوقت  
    }

    public static boolean updateMedicine(String Medicine_Name, String Reminder_Times, String Dosage_ParDay, String Medicine_Time, String Days, String Duration) {
        return true; // note where condition (name and time and date)
    }

    public static boolean insertTask(String taskName, String description, LocalDate reminderDate, LocalTime reminderTime, String taskType) {
        try {
            stm = sqlitecon.prepareStatement("INSERT INTO tasks (task_name, descript, reminder_date, reminder_time, taskType) VALUES (?, ?, ?, ?, ?)");
            stm.setString(1, taskName);
            stm.setString(2, description);
            stm.setString(3, reminderDate.toString());
            stm.setString(4, reminderTime.toString());
            stm.setString(5, taskType);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean selectToDayTasks() {
        PreparedStatement stm2;
        DelayTaskList.clear();
        System.out.println("inside function");
        try {
            stm2 = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1980DTA' AND reminder_time >= time('now') ORDER BY reminder_time desc");

            System.out.println("inside function22");
            ResultSet r = stm2.executeQuery();
            System.out.println("ok statement");
            while (r.next()) {
                String taskName = r.getString("task_name");
                String description = r.getString("descript");
                LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
                LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

                new TodayTask(taskName, description, reminderTime, reminderDate);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuerieAdninstratorSqlite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean selectWeekTasks() {
        WeekTaskList.clear();

        try {
            Statement stm2 = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '5317WTK' and reminder_date >= time('now') and reminder_time >= time('now') ORDER BY  reminder_date , reminder_time desc");

            ResultSet r = stm.executeQuery();

            while (r.next()) {
                String taskName = r.getString("task_name");
                String description = r.getString("descript");
                LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
                LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

                new WeekTask(taskName, description, reminderTime, reminderDate);

            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuerieAdninstratorSqlite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean selectCompletedTasks() {
        CompletedTaskList.clear();
        try {
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1097CTA' ORDER BY  reminder_date , reminder_time desc");

            ResultSet r = stm.executeQuery();

            while (r.next()) {
                String taskName = r.getString("task_name");
                String description = r.getString("descript");
                LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
                LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

                new CompletedTask(taskName, description, reminderTime, reminderDate);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuerieAdninstratorSqlite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean selectDelayTasks() {

        try {
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1801DTKH' ORDER BY  reminder_date , reminder_time desc");

            ResultSet r = stm.executeQuery();

            DelayTaskList.clear();
            while (r.next()) {
                String taskName = r.getString("task_name");
                String description = r.getString("descript");
                LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
                LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

                new DelayTask(taskName, description, reminderTime, reminderDate);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuerieAdninstratorSqlite.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
    }

    public static boolean weekToDayTasks(String taskName, LocalTime reminderTime) {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '5317WTK' WHERE taskType = '1980DTA' AND  task_name = ? AND reminder_time = ? ");
            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public static boolean dayToDelayTasks(String taskName, LocalTime reminderTime) {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1801DTKH' WHERE taskType = '1980DTA' AND  task_name = ? AND reminder_time = ? ");
            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean dayToCompletedTasks(String taskName, LocalTime reminderTime) {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1097CTA' WHERE taskType = '1980DTA' AND  task_name = ? AND reminder_time = ? ");
            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean weekToCompletedTasks(String taskName, LocalTime reminderTime) {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1097CTA' WHERE taskType = '5317WTK' AND  task_name = ? AND reminder_time = ? ");
            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean updateTasks(String taskName, LocalTime reminderTime, LocalDate Reminder_Date) {
        try {
            stm = ConnectionDB.sqlitecon.prepareStatement("UPDATE tasks SET task_name = ? reminder_time = ? reminder_date = ? WHERE task_name = ? AND reminder_time = ? AND reminder_date = ? ");

            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.setString(3, Reminder_Date.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
            
        }
    }

}

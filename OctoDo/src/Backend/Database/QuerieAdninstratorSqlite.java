package Backend.Database;

import static Backend.Database.ConnectionDB.sqlitecon;
import Backend.Medicine.Medicine2;
import static Backend.Medicine.Medicine2.MedicineList;
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

    static private PreparedStatement stm = null;

    static void createTables() throws SQLException {
        // SQL statements to create tables
        String[] tableCreationStatements = {
            "CREATE TABLE IF NOT EXISTS taskType (typeID varchar (30) PRIMARY KEY, typeName varchar(60))",
            "CREATE TABLE IF NOT EXISTS  tasks (task_name VARCHAR(150), descript varchar(254) , reminder_date DATE , reminder_time TIME , taskType varchar (30) , is_complete BOOLEAN DEFAULT FALSE ,  FOREIGN KEY (taskType) REFERENCES taskType(typeID))",
            "create table if not exists Medicine (Medicine_name varchar(30), reminderTimes varchar(30), Dosage_ParDay varchar(10) ,Medicine_Time time,Days varchar(20) ,Duration date)" 

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
        /*
        String insertSQL = "INSERT OR IGNORE INTO taskType (typeID, typeName) VALUES('1980DTA', 'dayTask'), "
                + "('5317WTK', 'weekTask'), "
                + "('1097CTA', 'completedTask'), "
                + "('1801DTKH', 'delayTask')";
        try (PreparedStatement p = sqlitecon.prepareStatement(insertSQL)) {
            p.execute();
        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
         */
        try {
            String[] insertQueries = {
                "INSERT OR IGNORE INTO taskType (typeID, typeName) VALUES ('1980DTA', 'dayTask')",
                "INSERT OR IGNORE INTO taskType (typeID, typeName) VALUES ('5317WTK', 'weekTask')",
                "INSERT OR IGNORE INTO taskType (typeID, typeName) VALUES ('1097CTA', 'completedTask')",
                "INSERT OR IGNORE INTO taskType (typeID, typeName) VALUES ('1801DTKH', 'delayTask')"
            };

            for (String insertQuery : insertQueries) {
                try (PreparedStatement p = sqlitecon.prepareStatement(insertQuery)) {
                    p.execute();
                }
            }

            System.out.println("Insertion successful");
        } catch (SQLException ex) {
            System.out.println("Error inserting data");
            ex.printStackTrace();
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }

    }

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
        MedicineList.clear();
        try {
            stm = sqlitecon.prepareStatement("select Medicine_name , reminderTimes , Dosage_ParDay  ,Medicine_Time ,Days ,Duration  from Medicine");
            ResultSet r = stm.executeQuery();
            while (r.next()) {
                String Medicine_name = r.getString("Medicine_name");
                String reminderTimes = r.getString("reminderTimes");
                String Dosage_ParDay = r.getString("Dosage_ParDay");
                String Days = r.getString("Days");
                LocalDate Duration = LocalDate.parse(r.getString("Duration"));
                LocalTime Medicine_Time = LocalTime.parse(r.getString("Medicine_Time"));
                new Medicine2(Medicine_name , reminderTimes , Medicine_Time , Days , Duration );
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuerieAdninstratorSqlite.class.getName()).log(Level.SEVERE, null, ex);
            return false ;
        }
         // note : ترجع كل الميديسن بالترتيب علي حسبالتاريخ اولا ثم الوقت  
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
            stm.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("errrorr insert");
            return false;
        }
    }

    public static boolean selectToDayTasks() {

        DelayTaskList.clear();

        try {
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1980DTA' AND reminder_time >= time('now', 'localtime') ORDER BY reminder_time");

            ResultSet r = stm.executeQuery();

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
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '5317WTK' and reminder_date >= date('now')  ORDER BY  reminder_date , reminder_time");

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
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1097CTA' ORDER BY  reminder_date , reminder_time ");
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
            stm = sqlitecon.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1801DTKH' ORDER BY  reminder_date , reminder_time ");
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

    public static boolean weekToDayTasks() {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1980DTA' WHERE taskType = '5317WTK' AND   reminder_date >= date('now')");
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public static boolean dayToDelayTasks() {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1980DTA' WHERE taskType = '5317WTK' AND julianday('now') > julianday(reminder_date)");
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean ToCompletedTasks(String taskName, LocalTime reminderTime, LocalDate reminderDate) {
        try {
            stm = sqlitecon.prepareStatement("UPDATE tasks SET taskType = '1097CTA' , is_complete = 'TRUE' WHERE task_name = ? AND reminder_time = ? AND reminder_date = ?");
            stm.setString(1, taskName);
            stm.setString(2, reminderTime.toString());
            stm.setString(3, reminderDate.toString());
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    /*
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

     */
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

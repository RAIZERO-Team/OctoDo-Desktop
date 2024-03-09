package Backend.Database;

import static Backend.Database.ConnectionDB.con;
import static Backend.Database.ConnectionDB.sqlitecon;
import Backend.Task.CompletedTask;
import Backend.Task.DelayTask;
import Backend.Task.Task;
import Backend.Task.TodayTask;
import Backend.Task.WeekTask;
import com.sun.jdi.connect.spi.Connection;

import java.sql.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import raven.toast.Notifications;

public class QuerieAdninstratorSqlite {

    static void createTables(Connection connection) throws SQLException {
        // SQL statements to create tables
        String[] tableCreationStatements = {
            "CREATE TABLE taskType (typeID varchar (30) PRIMARY KEY, typeName varchar(60))",
            "CREATE TABLE  tasks (task_name VARCHAR(150), descript TEXT , reminder_date DATE , reminder_time TIME , taskType varchar (30) ,  FOREIGN KEY (taskType) REFERENCES taskType(typeID))"
        // Add more table creation statements as needed
        };

        // Execute SQL statements to create tables
        String createTableSQL = "CREATE TABLE %s";
        try (PreparedStatement preparedStatement = sqlitecon.prepareStatement(createTableSQL)) {
            for (String tableCreationStatement : tableCreationStatements) {
                // preparedStatement.setString(1, tableCreationStatement);
                preparedStatement.execute(tableCreationStatement);
            }
        }
    }

    static void insertData() throws SQLException {
        String insertSQL = "INSERT INTO taskType  values('1980DTA' , 'dayTask'),"
                + "('5317WTK','weekTask')" + "('1097CTA' , 'completedTask')" + "('1801DTKH','delayTask')";
        try (PreparedStatement p = sqlitecon.prepareStatement(insertSQL)) {
            p.execute();
        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
    }
    static private PreparedStatement stm;

    public static boolean InsertMedicine(String Medicine_Name, String Reminder_Times, String Dosage_ParDay, String Medicine_Time, String Days, String Duration) {
        try {
            stm = con.prepareStatement("INSERT INTO Medicine (Medicine_name, reminderTimes,Dosage_ParDay, Medicine_Time, Days , Duration) VALUES (?, ?, ?, ?, ?, ?)");
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
            stm = con.prepareStatement("DELETE FROM Medicine WHERE Medicine_Name =?");
            stm.setString(1, MedicineName);
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    public static boolean insertTask(String taskName, String description, LocalDate reminderDate, LocalTime reminderTime, String taskType) {
        try {
            stm = con.prepareStatement("INSERT INTO tasks (task_name, descript, reminder_date, reminder_time, taskType) VALUES (?, ?, ?, ?, ?)");
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

    public static boolean selectToDayTasks() throws SQLException {

        stm = con.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1980DTA' AND reminder_time >= now() ORDER BY reminder_time desc");

        ResultSet r = stm.executeQuery();

        while (r.next()) {
            String taskName = r.getString("task_name");
            String description = r.getString("descript");
            LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
            LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

            new TodayTask(taskName, description, reminderTime, reminderDate);
        }
        return false;
    }

    public static boolean selectWeekTasks() throws SQLException {

        stm = con.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '5317WTK' and reminder_date >= now() and reminder_time >= now() ORDER BY  reminder_date , reminder_time desc");

        ResultSet r = stm.executeQuery();

        while (r.next()) {
            String taskName = r.getString("task_name");
            String description = r.getString("descript");
            LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
            LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

            new WeekTask(taskName, description, reminderTime, reminderDate);

        }
        return false;
    }

    public static boolean selectCompletedTasks() throws SQLException {

        stm = con.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1097CTA' ORDER BY  reminder_date , reminder_time desc");

        ResultSet r = stm.executeQuery();

        while (r.next()) {
            String taskName = r.getString("task_name");
            String description = r.getString("descript");
            LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
            LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

            new CompletedTask(taskName, description, reminderTime, reminderDate);
        }
        return false;
    }

    public static boolean selectDelayTasks() throws SQLException {

        stm = con.prepareStatement("SELECT task_name, descript, reminder_date, reminder_time FROM tasks WHERE taskType = '1801DTKH' ORDER BY  reminder_date , reminder_time desc");

        ResultSet r = stm.executeQuery();

        while (r.next()) {
            String taskName = r.getString("task_name");
            String description = r.getString("descript");
            LocalDate reminderDate = LocalDate.parse(r.getString("reminder_date"));
            LocalTime reminderTime = LocalTime.parse(r.getString("reminder_time"));

            new DelayTask(taskName, description, reminderTime, reminderDate);
        }
        return false;
    }
}

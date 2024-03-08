package Backend.Database;

import static Backend.Database.ConnectionDB.con;
import static Backend.Database.ConnectionDB.sqlitecon;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import raven.toast.Notifications;

public class QuerieAdninstratorSqlite {

    static private PreparedStatement stm;

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

    public static boolean InsertDataMedicine(String Medicine_Name, String Reminder_Times, String Dosage_ParDay, String Medicine_Time, String Days, String Duration) {
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

    public static boolean DeleteDataMedicine(String MedicineName) {
        try {
            stm = sqlitecon.prepareStatement("DELETE FROM Medicine WHERE Medicine_Name =?");
            stm.setString(1, MedicineName);
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }
}

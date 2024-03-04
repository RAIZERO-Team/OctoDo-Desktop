
package Backend.Database;


import static Backend.Database.ConnectionDB.sqlitecon;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
      
      static void insertData()throws SQLException {
        String insertSQL = "INSERT INTO taskType  values('1980DTA' , 'dayTask'),"
             + "('5317WTK','weekTask')" + "('1097CTA' , 'completedTask')" + "('1801DTKH','delayTask')";
        try (PreparedStatement p = sqlitecon.prepareStatement(insertSQL)) {
            p.execute();
        }catch(SQLException ex){
             Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
    }
      

}
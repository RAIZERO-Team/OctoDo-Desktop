package Backend.Database;


import static Backend.Database.QuerieAdninstratorSqlite.insertData;
import static Backend.Database.QuerieAdninstratorSqlite.createTables;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class ConnectionDB {

    static Connection con;
    static Connection sqlitecon;
    static {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Octodo",
                    "root", "");

        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");

        }
    }
   static{
        try{
            sqlitecon = (Connection) DriverManager.getConnection("jdbc:sqlite:task.db");
            if (sqlitecon != null) {
                // Create tables
                createTables((com.sun.jdi.connect.spi.Connection) sqlitecon);
                insertData();
                System.out.println("Tables created successfully.");
            }
        }catch(SQLException ex){
             Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
    }


}

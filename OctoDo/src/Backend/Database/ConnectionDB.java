package Backend.Database;

import static Backend.Database.QuerieAdninstratorSqlite.insertData;
import static Backend.Database.QuerieAdninstratorSqlite.createTables;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class ConnectionDB {

    static Connection con;
    static Connection sqlitecon;

    public static void method() {
    }

    static {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6696329",
                    "sql6696329", "6izBibqiWg");

        } catch (SQLException ex) {
            System.out.println(ex);
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");

        }

    }

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            sqlitecon = DriverManager.getConnection("jdbc:sqlite:tt.db");
            if (sqlitecon != null) {
                // Create tables
                createTables();
                insertData();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

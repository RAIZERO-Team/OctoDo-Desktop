package Backend.Database;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class ConnectionDB {

    static Connection con;

    static {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Octodo",
                    "root", "19712003");

        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");

        }
    }

}

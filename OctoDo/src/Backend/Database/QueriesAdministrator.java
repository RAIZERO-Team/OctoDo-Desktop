package Backend.Database;

import Backend.Account.User;
import static Backend.Database.ConnectionDB.con;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueriesAdministrator {

    static private PreparedStatement stm;

    public static boolean isEmailExist(String Email) {

        try {
            stm = con.prepareStatement("select count(User_email) from User where User_email = ?");
            stm.setString(1, Email);
            ResultSet rs = stm.executeQuery();
            int count = -1;
            while (rs.next()) {

                count = rs.getInt(1);

            }

            return count >= 1;

        } catch (SQLException e) {

            return false;
        }
    }

    public static boolean sign_up(String fname, String lname, String email, String password, String gender) {

        try {
            stm = con.prepareStatement("insert into User (User_fname , User_lname , User_email  , User_password , User_gender  )"
                    + "values(? , ? , ? , ? , ?  )");

            stm.setString(1, fname);
            stm.setString(2, lname);
            stm.setString(3, email);
            stm.setString(4, encryptionPassword(password));
            stm.setString(5, gender);

            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean sign_in(String Email, String paswword) {
        try {
            stm = con.prepareStatement("select count(*) from User where User_email = ? and User_password = ? ");
            stm.setString(1, Email);
            stm.setString(2, paswword);

            ResultSet re = stm.executeQuery();
            int count = 0;
            while (re.next()) {
                count = re.getInt(1);
            }
            return count == 1;

        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }

    }

    public static User CurrentUser(String email) {

        try {
            stm = con.prepareStatement("select User_fname , User_lname ,User_gender from User where User_email=?");
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                String user_fname = rs.getString("User_fname");
                String user_lname = rs.getString("User_lname");
                String user_gender = rs.getString("User_gender");
                return new User(user_fname + " " + user_lname, email, user_gender);
            }

            return null;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(QueriesAdministrator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    static private String encryptionPassword(String password) {

        return password;
    }

    static private String decryptionPassword(String password) {

        return password;
    }

    public static boolean updatePassword(String username, String newPassword) {
        try {
            stm = ConnectionDB.con.prepareStatement("UPDATE User SET User_password = ? WHERE User_email = ?");

            stm.setString(1, newPassword);
            stm.setString(2, username);
            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

//    public static boolean addTask(String Task_Name, String description, String Task_Reminder_Date, String Task_Reminder_Time) {
//        try {
//            PreparedStatement stm = ConnectionDB.con.prepareStatement("INSERT INTO tasks (task_name, descript, reminder_date, reminder_time) VALUES (?, ?, ?, ?)");
//            
//            stm.setString(1, Task_Name);
//            stm.setString(2, description);
//            stm.setString(3, Task_Reminder_Date);
//            stm.setString(4, Task_Reminder_Time);
//
//            return true;
//        } catch (SQLException e) {
//            return false;
//        }
//    }
    public static boolean UpdateUsername(String fname, String lname, String email) {
        try {
            stm = ConnectionDB.con.prepareStatement("UPDATE User SET User_fname = ?, User_lname = ? WHERE User_email = ?");
            stm.setString(1, fname);
            stm.setString(2, lname);
            stm.setString(3, email);

            int rowsAffected = stm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}

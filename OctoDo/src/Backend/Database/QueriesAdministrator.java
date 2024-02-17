package Backend.Database;

import Backend.Account.User;
import java.sql.*;

public class QueriesAdministrator {

    static private PreparedStatement stm;

    public static boolean isEmailExist(String Email) {

        return false;
    }

    public static boolean sign_up(String fname, String lname, String email, String password, String gender) {

        return false;

    }

    public static boolean sign_in(String Email, String paswword) {
        return false;
    }

    public static User CurrentUser(String email) {
        try{
        stm = ConnectionDB.con.prepareStatement("select User_id , User_fname , User_lname ,User_ gender from user where User_email=? ");
        stm.setNString(1, email);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
        String user_id    = rs.getString("User_id");
        String user_fname = rs.getString("User_fname");
        String user_lname = rs.getString("User_lname");
        String user_gender = rs.getString("User_gender");

        return new User(user_id, user_fname, user_lname, user_gender);
        } 
        }
            
        catch (SQLException e) {

            return null;
        }
    }

    
    static private String encryptionPassword(String password) {

        return password;
    }

    static private String decryptionPassword(String password) {

        return password;
    }

}

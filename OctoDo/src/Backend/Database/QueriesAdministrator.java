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

    public static User CurrentUser(String email) throws SQLException {
       stm = ConnectionDB.con.prepareStatement("select User_id , User_fname , User_lname ,User_ gender from user where User_email=? ");
       stm.setNString(1, email);
        ResultSet rs = stm.executeQuery();
        ٍString  User_id= stm.getString( 1);
        ٍString User_fname = stm.getString( 2);
        ٍString User_lname = stm.getString( 3);
        ٍString User_ gender = stm.getString( 6);
        
        return new User();//send parameter in this constructor
    }

    static private String encryptionPassword(String password) {

        return password;
    }

    static private String decryptionPassword(String password) {

        return password;
    }

}

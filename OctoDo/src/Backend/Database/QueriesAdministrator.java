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
        return new User();//send parameter in this constructor
    }

    static private String encryptionPassword(String password) {

        return password;
    }

    static private String decryptionPassword(String password) {

        return password;
    }

}

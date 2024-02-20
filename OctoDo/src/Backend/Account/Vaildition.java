package Backend.Account;

public class Vaildition {

    public static boolean isValidName(String userName) {
        return userName != null && !userName.trim().isEmpty() && (userName.matches("[a-zA-Z]+") || userName.matches("[\\u0600-\\u06FF]+"));

    }

    public static boolean isValidemail(String userEmail) {

        return userEmail.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public static boolean isValidPassword(String userPassword) {

        return userPassword.matches("^[\\p{Alnum}\\p{Punct}]{8,}$");
    }

}

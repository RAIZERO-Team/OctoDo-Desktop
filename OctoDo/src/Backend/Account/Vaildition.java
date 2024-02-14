package Backend.Account;

public class Vaildition {

    public static boolean isValidName(String userName) {
        if (userName != null && userName.length() <= 50 && userName.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValidemail(String userEmail) {

        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$]";
        boolean result = userEmail.matches(regex);
        return result;

    }

    public static boolean isValidPassword(String userPassword) {

        return userPassword.length() < 8
                && userPassword.matches(".*\\d.*")
                && userPassword.matches(".*[a-z].*")
                && userPassword.matches(".*[A-Z].*");
    }

}

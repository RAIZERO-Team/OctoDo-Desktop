package Backend.Account;

import Backend.Audio.NotificationSound;
public class User {

    public static User currentUser;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userType;
    private String userImage;
    private String userGender;
    private NotificationSound  notification ;

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getUserGender() {
        return userGender;
    }

    public NotificationSound getNotification() {
        return notification;
    }

   

    public User(String userName, String userEmail , String userGender) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userImage = userImage;
        this.userGender = userGender;
    }

    public User() {
    }

}

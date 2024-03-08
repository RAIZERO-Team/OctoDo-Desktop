
package Backend.Audio;

public class NotificationSound {
    
    
    private String notification_name ; 
    private String notification_path ;

    public NotificationSound(String notification_name, String notification_path) {
        this.notification_name = notification_name;
        this.notification_path = notification_path;
    }

   
    
    public String getNotification_name() {
        return notification_name;
    }

    public void setNotification_name(String notification_name) {
        this.notification_name = notification_name;
    }

    public String getNotification_path() {
        return notification_path;
    }

    public void setNotification_path(String notification_path) {
        this.notification_path = notification_path;
    }
    
    
}

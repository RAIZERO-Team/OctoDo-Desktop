
package Backend.Account;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Vaildition {
       public static  boolean IsValidName(String userName) {
    if( userName !=null&&userName.length()<=50 &&userName.matches("^[a-zA-Z][a-zA-Z\\s]+$")) 
        return true;
      else
        return false;
    
        
      
       
   }
     public static  boolean IsValidemail(String userEmail) {
    
       String regex= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$]";
        boolean result=userEmail.matches(regex);
        return result;
        
      
       
        
   }
     
    
      public static boolean isValidPassword(String userPassword) {
        
        return userPassword .length() >=15  &&
               userPassword.matches(".*\\d.*") && 
               userPassword.matches(".*[a-z].*") && 
               userPassword.matches(".*[A-Z].*"); 
    }
      
    public static boolean isValidGender(String userGender) {
        
  return userGender.equalsIgnoreCase("male") || userGender.equalsIgnoreCase("female");
}
     public static boolean isValidUserType(String userType) {
    
        return userType.equalsIgnoreCase("admin") ||
               userType.equalsIgnoreCase("regular") ||
               userType.equalsIgnoreCase("guest");
     }
     public static boolean isValidImage(String userImage) {
        File file = new File(userImage);
        try {
            BufferedImage image = ImageIO.read(file);
            return image != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } 
     }}

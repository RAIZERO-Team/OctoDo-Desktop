
package Backend.Account;


public class User {
    
    
       private String  userName;
    private String userEmail;
    private String userPassword; 
    private String userType;
    private String userImage; 
    private String userGender;
     
    public String gitUserName(){
        return userName;
    }
    public String gitUserEmail(){
        return userEmail;
    } 
    
   public String gitUserType(){
        return userType;
    } 
 public String gitUserImage(){
        return userImage;
    } 
  public String gitUserGender(){
        return userGender;
    } 
  public User (String  userName,String userEmail, String userPassword,  String userType, String userImage, String userGender){
     this.userName=userName;
     this.userEmail=userEmail;
     this.userPassword=userPassword;
     this.userType=userType;
     this.userImage=userImage;
     this.userGender=userGender;
  }
}

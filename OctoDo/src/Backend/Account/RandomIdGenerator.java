package Backend.Account;

import java.security.SecureRandom;

public class RandomIdGenerator {

    private static final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public RandomIdGenerator(){
        
    }
    
//    public static void main(String[] args) {
//        String generatedId = generateRandomId(40);
//        System.out.println("Generated ID: " + generatedId);
//    }

    public static String generateRandomId(int length) {
        StringBuilder idBuilder = new StringBuilder(length);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(VALID_CHARACTERS.length());
            char randomChar = VALID_CHARACTERS.charAt(randomIndex);
            idBuilder.append(randomChar);
        }

        return idBuilder.toString();
    }
}

package Backend.Wisdom;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Wisdom {
   
    public static String WISDOM(){
        try {
            URL url = new URL("https://api.quotable.io/random");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse JSON manually
                String jsonString = response.toString();
                String content = jsonString.substring(jsonString.indexOf("content") + 9, jsonString.indexOf("author") - 2);
                System.out.println("Content:");
               // System.out.println(content);
               return content;
            } else {
                System.out.println("Failed to get quote. Response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Error";
  }
}

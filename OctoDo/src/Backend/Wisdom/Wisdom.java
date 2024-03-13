package Backend.Wisdom;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.json.JSONObject;
public class Wisdom {
     public static void main(String[] args) {
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

              //  JSONObject jsonObject = new JSONObject(response.toString());
         //      String content = jsonObject.getJSONObject("content").getString("content");
                System.out.println("Content:");
                System.out.println(response);
            } else {
                System.out.println("Failed to get quote. Response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


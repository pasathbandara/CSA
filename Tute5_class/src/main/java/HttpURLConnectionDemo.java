import java.io.*;
import java.net.*;

public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {

// Using the URL class in java.net package, we specify a URL
            URL url = new URL("https://www.booking.com/");

//Create an object from HttpURLConnection and invoke openConnection() method
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

//For loop in order to get the first 8 fields of the headers of HTTP message
            for (int i = 1; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " = " +
                        huc.getHeaderField(i));
            }
            int responseCode = huc.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new
                        InputStreamReader(huc.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in .readLine()) != null) {
                    response.append(inputLine);
                } in .close();
                // print result
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }

            //close the connection
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {

// Using the URL class in java.net package, we specify a URL
            URL url = new URL("http://www.parliament.lk/");
//Create an object from HttpURLConnection and invoke openConnection() method
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            //Invoke setRequestMethod and specify the type of HTTP request to "GET"
            huc.setRequestMethod("GET");
            //Invoke setRequestProperty method and pass the USER_AGENT as parameter
            int responseCode = huc.getResponseCode();
            System.out.println("Response code: " + responseCode);
//For loop in order to get the first 8 fields of the headers of HTTP message
            for (int i = 1; i <= 8; i++) {
                System.out.println("[SERVER] - " + huc.getHeaderFieldKey(i) + " = " +
                        huc.getHeaderField(i));
            }
            //close the connection
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



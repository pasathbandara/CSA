import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpURLConnectionExample {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "https://www.google.com";

    private static void sendHttpGETRequest() throws IOException {
        //create a url Object
        URL url = new URL(GET_URL);
        //Invoke openConnection method by creating an object of HttpURLConnection
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        //Invoke setRequestMethod and specify the type of HTTP request to "GET"
        httpURLConnection.setRequestMethod("GET");
        //Invoke setRequestProperty method and pass the USER_AGENT as parameter
        httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
        //create an integer variable called response code and using the
        int responseCode = httpURLConnection.getResponseCode();
        //printing the response code
        System.out.println("Sending GET request to URL: " + GET_URL);
        System.out.println("Response code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(httpURLConnection.getInputStream()));
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
        for (int i = 0; i < 8; i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
        }
    }

    public static void main(String[] args)throws Exception {
        sendHttpGETRequest();
    }
}

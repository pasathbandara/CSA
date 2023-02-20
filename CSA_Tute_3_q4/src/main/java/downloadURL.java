import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class downloadURL {
    public static void main(String[] args) throws IOException {
//        https://www.geeksforgeeks.org/download-web-page-using-java/
        String url = "https://www.geeksforgeeks.org/";
        DownloadWebPage(url);
    }
    public static void DownloadWebPage(String webpage) {
        BufferedReader readr;
        String line;
        BufferedWriter writer;
        try {
            // Create URL object
            URL url = new URL(webpage);
            readr = new BufferedReader(new InputStreamReader(url.openStream()));

            // Enter filename in which you want to download
            writer = new BufferedWriter(new FileWriter("Download.html"));

            // read each line from stream till end
            while ((line = readr.readLine()) != null) {writer.write(line);}

            readr.close();
            writer.close();
            System.out.println("[SERVER] - Successfully Downloaded.");
        }
        // Exceptions
        catch (MalformedURLException mue) {System.out.println("[SERVER] - Malformed URL Exception raised");}
        catch (IOException ie) {System.out.println("[SERVER] - IOException raised");}
    }
}

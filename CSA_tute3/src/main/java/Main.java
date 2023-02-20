import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
//        https://www.geeksforgeeks.org/finding-ip-address-of-a-url-in-java/
//        String s = "https://www.google.com";
//        try {
//            // Fetch IP address by getByName()
//            InetAddress ip = InetAddress.getByName(new URL(s)
//                    .getHost());
//
//            // Print the IP address
//            System.out.println("Public IP Address of: " + ip.getHostAddress());
//        }
//        catch (MalformedURLException e) {
//            // It means the URL is invalid
//            System.out.println("Invalid URL");
//        } catch (UnknownHostException e) {
//            throw new RuntimeException(e);
//        }

        try {
            URL u = new URL("https://www.google.com");
            System.out.println("[CLIENT] - Query Host");
            InetAddress x = InetAddress.getByName("PasathB-PC"); // to check ur ip
            System.out.println("[SERVER] - Query Host Completed");
            String destiIP = x.getHostAddress();
            System.out.println(destiIP);
        }catch (UnknownHostException | MalformedURLException ex){
            System.out.println("[SERVER] - "+ex.getClass().getName() + ""+ex.getMessage());
        }


    }
}

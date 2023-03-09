import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
    try {
        //create a socket with two parameters; hostname and port number
        Socket s = new Socket("localhost", 6666);
        //Output stream to sendout the message to the server
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        //writes a string to the underlying output stream using modified UTF-8 encoding.

        dout.writeUTF("Hello Server");
        //System.out.println("test case 1");

        //flush the characters from the buffered writer stream
        dout.flush();
        dout.close();
        //close the connection
        s.close();
    } catch (Exception e) {System.out.println("try this");}
    }
}

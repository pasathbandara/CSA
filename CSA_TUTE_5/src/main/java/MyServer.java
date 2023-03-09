// Run this first before running the client
import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) {
        try {
            try ( //create a server socket using port number 6666
                  ServerSocket ss = new ServerSocket(6666)) {
                System.out.println("Server started");

                System.out.println("Waiting for a client ...");
                Socket s = ss.accept();//establishes connection
                //create inputstream to get the message for the client as an
                System.out.println("Client accepted");

                DataInputStream dis = new
                        DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println("message= " + str);
                System.out.println("works");
                //close server connection
            } //establishes connection
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


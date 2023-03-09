import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketServerExample {
    private static ServerSocket ss;
    private static int port = 9876;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try{
            ss = new ServerSocket(1212);
            System.out.println("Server started. Listening to the port 1212");
        } catch (IOException e) {
            System.out.println("Could not listen on port: 1212");
            System.exit(-1);
        }
        while (true){
            System.out.println("Waiting for the client request");
        }





}
}

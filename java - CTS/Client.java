import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s =
                new Socket("localhost",5000);

        DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

        dos.writeUTF("Hello Server");

        s.close();
    }
}
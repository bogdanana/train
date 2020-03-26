package train;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Server {
    static final byte[] httpResponse = "Hello World".getBytes(StandardCharsets.UTF_8);
    public static void main(String[] args) throws IOException {


       try( ServerSocket server = new ServerSocket(0)) {
           server.setReuseAddress(true);
           System.out.println("listening on port: " + server.getLocalPort());
           while (true) {
               Socket clientSocket = server.accept();
               clientSocket.getOutputStream().write(httpResponse);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
        /*
        PrintStream out = new PrintStream(clientSocket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine();
            }

        }*/
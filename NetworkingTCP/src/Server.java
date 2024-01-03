import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter writer;
    private BufferedReader reader;

    public Server() {
    }

    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        socket = serverSocket.accept();
        writer = new PrintWriter(socket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        runServer();
    }


    private void runServer() {
        boolean isOpen = true;
        String msgFromClient;
        writer.println("Hello");
        writer.println("Welcome");
        while (isOpen) {
            try {
                msgFromClient = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (msgFromClient.contains("bieber")) {
                System.out.println("miss you selena");
            }
            if (msgFromClient.contains("hailey")) {
                System.out.println("whyy selena?");
            }
            if (msgFromClient.contains("ah ah ah ah")){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("STAYIN ALIVEEEEEEE");
                }
            }
            if (msgFromClient.contains("quit")) {
                isOpen = false;

            }
            writer.println("You wrote: " + msgFromClient);
        }
    }


}

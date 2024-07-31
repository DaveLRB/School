import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Server {

    private ServerSocket server;
    private Socket socket;
    private PrintWriter writer;
    private BufferedReader reader;

    public Server() {
    }

    public void startServer(int port) throws IOException {
        server = new ServerSocket(port);
        socket = server.accept();
        writer = new PrintWriter(socket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        runServer();
    }


    private void runServer() throws IOException {
        boolean isOpen = true;
        String msgFromClient;
        LocalDateTime time = LocalDateTime.now();
        writer.println("Hello and Welcome");
        writer.println("Start writing please");


        while (isOpen) {
            try {
                msgFromClient = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Term: " + msgFromClient + " --> sent at: " + time);
            /*if (msgFromClient.contains("bieber")) {
                System.out.println("miss you selena");
            }
            if (msgFromClient.contains("hailey")) {
                System.out.println("whyy selena?");
            }
            if (msgFromClient.contains("ah ah ah ah")){
                for (int i = 0; i < 1000; i++) {
                    System.out.println("STAYIN ALIVEEEEEEE");
                }
            }*/

            if (msgFromClient.contains("quit")) {
                System.out.println("Ba bye!");
                isOpen = false;

            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write here");
            String temp = scanner.nextLine();
            writer.println("IDE : " + temp + " --> sent at: " + time);

        }
    }
}

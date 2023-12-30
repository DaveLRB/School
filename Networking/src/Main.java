import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(8666);

            while (true) {
                byte[] receivedByArray = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(receivedByArray, receivedByArray.length);
                datagramSocket.receive(datagramPacket);
                String msg = new String(datagramPacket.getData()).trim();
                System.out.println(msg.trim());

                if (msg.equals("mariachi")) {
                    String mssg = "Oleee";
                    receivedByArray = mssg.getBytes();
                    DatagramPacket datagramPacket11 = new DatagramPacket(receivedByArray, receivedByArray.length,datagramPacket.getAddress(),datagramPacket.getPort());
                    datagramSocket.send(datagramPacket11);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

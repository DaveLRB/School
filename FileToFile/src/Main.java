import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        FilesSS filesSS = new FilesSS();

        filesSS.fileToRead();

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password data: ");
        String passData = scanner.nextLine();

        File file = new File("PassData");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write(passData);
        bufferedWriter.newLine();
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();


        System.out.print("Enter user data: ");
        String userData = scanner.nextLine();
        File file1 = new File("UserData");
        FileWriter fileWriter1 = new FileWriter(file1, true);
        fileWriter1.write(userData + "\n");
        fileWriter1.flush();
        fileWriter1.close();
        FileReader fileReader1 = new FileReader(file1, StandardCharsets.UTF_8);

        while ((i = fileReader1.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader1.close();
        scanner.close();*/

    }
}


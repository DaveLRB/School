import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password data: ");
        String inputData = scanner.nextLine();

        File file = new File("PassData");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(inputData + "\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();


        System.out.print("Enter user data: ");
        File file1 = new File("UserData");
        fileWriter.write(inputData + "\n");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader1 = new FileReader(file1, StandardCharsets.UTF_8);

        while ((i = fileReader1.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader1.close();
        scanner.close();
    }


}


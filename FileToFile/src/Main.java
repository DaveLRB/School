import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner("PassPass");
        File file = new File("PassData");
        FileWriter fileWriter = new FileWriter(file, true);
        System.out.println("Write here");
        scanner.nextLine();
        fileWriter.write("BS");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
        int i;
        while((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();

        File file1 = new File("PassPass");

        FileReader fileReader1 = new FileReader(file1, StandardCharsets.UTF_8);

        while ((i = fileReader1.read()) != -1){
            System.out.print((char)i);
        }
        fileReader1.close();

    }


}

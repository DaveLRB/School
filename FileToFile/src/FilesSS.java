import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FilesSS {

    public void fileToRead() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the file name with extension: ");
            String fileName = scanner.nextLine();

            try (Scanner fileScanner = new Scanner(new File(fileName))) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException("File not found: " + fileName, e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


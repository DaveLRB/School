import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesSS {

    try {
        System.out.print("Enter the file name with extension : ");

        Scanner input = new Scanner(System.in);

        File file = new File(input.nextLine());

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


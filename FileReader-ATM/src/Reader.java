import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Reader {


    public Reader(File usersfile, Charset utf8) {

    }

    private void readerFiles() throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Users Data : ");
        String usersData = input.nextLine();

        File usersfile = new File("UsersData");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usersfile,true));
        bufferedWriter.write(usersData);
        bufferedWriter.newLine();
        bufferedWriter.close();

        FileReader fileReader;
        fileReader = new FileReader(usersfile, StandardCharsets.UTF_8);
        int line;
        while ((line = fileReader.read()) != -1) {
            System.out.print((char) line);
        }
        fileReader.close();
        input.close();


    }


}

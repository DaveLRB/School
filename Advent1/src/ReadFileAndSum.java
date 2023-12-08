import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndSum {
    public static void main(String[] args) {

        String filePath = "/Users/mindera/Documents/School/Advent1/src/pinput";

        int sum = 0;

        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = buffer.readLine()) != null) {
                int firstDigit = 0, lastDigit = 0;

                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.charAt(i))) {
                        firstDigit = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                }

                for (int i = line.length() - 1; i >= 0; i--) {
                    if (Character.isDigit(line.charAt(i))) {
                        lastDigit = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                }

                if (firstDigit != 0 && lastDigit != 0) {
                    int combinedValue = firstDigit * 10 + lastDigit;
                    sum += combinedValue;
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
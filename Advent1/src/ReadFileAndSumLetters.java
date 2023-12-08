import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFileAndSumLetters {
    public static void main(String[] args) {

        String filePath = "/Users/mindera/Documents/School/Advent1/src/pinput";

        int sum = 0;

        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line;

            Map<String, String> wordToNumber = new HashMap<>();

            wordToNumber.put("one", "o1ne");
            wordToNumber.put("two", "t2wo");
            wordToNumber.put("three", "t3hree");
            wordToNumber.put("four", "f4our");
            wordToNumber.put("five", "f5ive");
            wordToNumber.put("six", "s6ix");
            wordToNumber.put("seven", "s7even");
            wordToNumber.put("eight", "e8ight");
            wordToNumber.put("nine", "n9ine");

            while ((line = buffer.readLine()) != null) {
                int firstDigit = 0, lastDigit = 0;


                for (Map.Entry<String, String> entry : wordToNumber.entrySet()) {
                    line = line.replaceAll(entry.getKey(), entry.getValue());
                }

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

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 30, 5, 7, 8};
        int number = 7;
        int index = 0;
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                index++;
        }
        int[] outArray = new int[array.length - index];
        for (int j = 0; j < array.length; j++) {
            if (array[j] != number) {
                outArray[ind] = array[j];
                ind++;
            }
        }
        System.out.println("\n \n \n{");
        Arrays.stream(outArray).forEach(System.out::println);
        System.out.println("}");
        }

    }



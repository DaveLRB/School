import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write here : ");
        String phrase = sc.nextLine().toLowerCase().replaceAll(" ", "");

        String[] sentArray = phrase.split("");

        //System.out.println(Arrays.toString(sentArray));
        String[] reverseArray = new String[sentArray.length];
        //System.out.println(Arrays.toString(reverseArray));
        int counter = 0;
        for (int i = sentArray.length - 1; i >= 0; i--) {

            reverseArray[counter] = sentArray[i];
            counter++;
        }
        //System.out.println(Arrays.toString(reverseArray));
        if (Arrays.toString(sentArray).equals(Arrays.toString(reverseArray))) {
            System.out.println("is a Palindrome");

        } else {
            System.out.println("is not Palindrome");
        }
    }
}
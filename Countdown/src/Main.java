import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println(" Start the countdown for the end!");
        int num = input.nextInt();

        for (int i = num; i > 0; i--) {

            System.out.println(i);
        }
    }




}
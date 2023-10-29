import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int num;
        int reversednum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Put the number here : ");

        num = input.nextInt();
        while (num != 0) {
            reversednum *= 10;
            reversednum += num % 10;
            num /= 10;

        }

        System.out.println("The reverse is : " + reversednum);

    }
}

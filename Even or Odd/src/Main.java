import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number : ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is EVENNN");

        }

        else {
            System.out.println(num + " is ODDD");

        }
    }
}
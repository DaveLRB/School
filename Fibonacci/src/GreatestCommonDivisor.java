import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        num1 = input.nextInt();
        System.out.print("Input second number: ");
        num2 = input.nextInt();

        int calculate = greatestCD(num1, num2);
        System.out.printf("CGD : " + calculate);

    }

    public static int greatestCD(int a, int b) {
        return (b == 0) ? a : greatestCD(b, a % b);
    }
}

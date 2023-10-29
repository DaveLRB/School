import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input number : ");
        int num = input.nextInt();
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor *= i;
        }
        System.out.println("Factorial of the number is : " + factor);
    }
}

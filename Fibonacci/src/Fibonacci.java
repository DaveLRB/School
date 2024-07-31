import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long num;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        num = input.nextLong();

        for (long i = 0; i <= num; i++) {
            System.out.println(fibo(i));
        }

    }

    public static long fibo(long n) {
        return (n <= 1) ? n : fibo(n - 1) + fibo(n - 2);
    }
}

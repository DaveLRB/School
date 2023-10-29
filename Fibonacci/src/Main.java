import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long num, firstN, secondN = 0, thirdN = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        num = input.nextLong();

        for (long i = 1; i <= num; i++) {
            firstN = secondN;
            secondN = thirdN;
            thirdN = firstN + secondN;
            System.out.println(firstN);
        }

    }
}

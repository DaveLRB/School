import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        boolean checkIf = false;
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                checkIf = true;
                break;
            }
        }
            if (!checkIf) {
                System.out.println(num + " is a Prime ");
            } else {
                System.out.println(num + " is not a Prime ");
            }


    }
}
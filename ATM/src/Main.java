import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] billsAvailable = {50, 20, 10, 1};

        System.out.println(" Please input amount : ");
        int amountWithdrawed = input.nextInt();

        if (amountWithdrawed <= 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < billsAvailable.length; i++) {
            int typeofBill = billsAvailable[i];
            int count = amountWithdrawed / typeofBill;
            if (count > 0) {
                System.out.println(typeofBill + " € " + " bills : " + count);
            }
            amountWithdrawed %= typeofBill;
        }
        input.close();
    }
}
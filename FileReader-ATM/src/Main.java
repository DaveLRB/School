/*Read list of users from file (eg.)
        Gisela -  123456 - 100€
        Francisco - 654321 - 20€
        José - 987654 - 1000€ - card blocked
        ATM allows transactions between users, withdrawals and deposits (using Card)
        Every transaction should be recorded on a audit file (with status: success or error)
        do not forget to update users balance after every transaction*/

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FileManagement reader = new FileManagement();
        reader.readFiles("/Users/mindera/Documents/School/FileReader-ATM/UsersData");
        List<User> usersData = reader.getUserData();

        ATM atm = new ATM(usersData, "/Users/mindera/Documents/School/FileReader-ATM/UsersData");


        while (true) {
            mainMenu();
            String userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("Enter account number:");
                    int depositAccount = input.nextInt();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = input.nextDouble();
                    boolean depositSuccess = atm.deposit(depositAccount, depositAmount);
                    if (depositSuccess) {
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Deposit failed. Account not found");
                    }
                    break;
                case "2":
                    System.out.println("Enter account number:");
                    int withdrawAccount = input.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = input.nextDouble();
                    boolean withdrawSuccess = atm.withdraw(withdrawAccount, withdrawAmount);
                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed. Insufficient funds or account not found");
                    }
                    break;
                case "3":
                    System.out.println("Enter account number to transfer from:");
                    int fromAccount = input.nextInt();
                    System.out.println("Enter account number to transfer to:");
                    int toAccount = input.nextInt();
                    System.out.println("Enter amount to transfer:");
                    double transferAmount = input.nextDouble();
                    boolean transferSuccess = atm.transfer(fromAccount, toAccount, transferAmount);
                    if (transferSuccess) {
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed. Insufficient funds or account not found");
                    }
                    break;
                case "4":
                    List<User> userData = reader.getUserData();
                    for (User user : userData) {
                        System.out.println(user.getName() + " - " + user.getAccNumber() + " - " + user.getBalance());
                    }
                    break;
                case "0":
                    System.out.println("Thanks for using our services!");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, input correct one\n");
                    break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Transfer");
        System.out.println("4.Data");
        System.out.println("0.Exit");
    }
}


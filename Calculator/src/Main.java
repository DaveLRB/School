import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char symbol;
        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        /*String fullOperation = input.nextLine();
        String[] operationValues = fullOperation.split(" ");

        num1 = Integer.parseInt(operationValues[0]);
        symbol = operationValues[1].charAt(0);
        num2 = Integer.parseInt(operationValues[2]);*/

        num1 = input.nextInt();
        symbol = input.next().charAt(0);
        num2 = input.nextInt();


            switch (symbol) {

                case '+':
                    result = num1 + num2;
                    System.out.print(result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.print(result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.print(result);
                    break;

                case '/':
                    result = num1 / num2;
                    System.out.print(result);
                    break;


                default:
                    System.out.println("Error tiny being");

            }


            input.close();
        }

    }


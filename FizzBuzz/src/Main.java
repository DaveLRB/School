import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dial a number");
        int i = scan.nextInt();
        for(int index=0; index <= i; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }

        }

    }

        /*sempre que o número for multiplo de 3  deve imprimir Fizz

        se que o número for multiplo de 5  deve imprimir Buzz

        se for multiplo de 3 e 5 deve FizzBuzz

        Caso contrario deve imprimir o número*/
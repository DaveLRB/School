import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dial a number");
        int num = scan.nextInt();
        int sum = 0;
        int multi = 1;
        int div = 0;
        int sub = 0;
        for (int i = num; i > 0; i--) {
               sum += i;
                sub -= i;
                if (i % 2 == 0) {
                multi *= i;
                div %= i;

            }





            System.out.println("the sum is " + sum);
            System.out.println("the subtraction is " + sub);
                System.out.println("the product is " + multi);
            System.out.println("the division is " + div);


        }
    }
}

   /* O vosso objetivo é imprimir na tela os números de X a 0, em que X é o número de o utilizador escolher, por exemplo:
        5
        4
        3
        2
        1
        0
        Formas de complicar:
        Sumar todos
        Multiplicar os pares
        etc...*/
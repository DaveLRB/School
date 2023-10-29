import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int counter = 0;
        int average = 0;

        while (number >= 0){
            System.out.println("Dial number");
            number =scan.nextInt();
        if (number >=0 ){
            average=average+number;
            counter++;
        }
        else {
            average =average/counter;

            System.out.println("The average is " + (float) average);
        }
        }
    }
}



/*Voces devem estar sempre a pedir números ao utilizador, até que ele ponha um número negativo.
Quando voces detetarem que o utilizador escreveu um número negativo devem parar de pedir número e
mostrar a média dos números que o utilizador escreveu, exemplo:

Utilizador -> 1
Utilizador -> 2
Utilizador -> 3
Utilizador -> -1
Média: 2*/
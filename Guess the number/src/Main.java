import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rounds = 6;
        Scanner input = new Scanner(System.in);
        Random randomize = new Random();

        int i;
        int higher = 100;
        int guessWhatnumber = randomize.nextInt(higher);

        for (i = 0; i < rounds; i++) {
            System.out.println("Please guess a number human : ");
            int number = input.nextInt();
            if (number == guessWhatnumber) {
                System.out.println("You got it ape...HAPPY BIRTHDAY");
                break;
            } else if (number > guessWhatnumber) {
                System.out.println("Way to high simp...");
            } else {
                System.out.println("Way to low inferior being..");
            }

        } if(i == rounds)

    {
        System.out.println("LOSER");
        System.out.println("it was " + guessWhatnumber);

    }
}

        }






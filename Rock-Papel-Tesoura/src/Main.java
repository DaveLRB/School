import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String[] threeHands = {"rock", "paper", "scissors"};
            String randomHand = threeHands[new Random().nextInt(threeHands.length)];
            String yourMove;

            while (true) {
                System.out.println(" Your move (rock,paper or scissors) :  ");
                yourMove = input.next();
                if (yourMove.equals(threeHands[0]) || yourMove.equals(threeHands[1]) || yourMove.equals(threeHands[2])) {
                    break;
                }
                System.out.println(yourMove + " is an Invalid input");
            }
            System.out.println(" CPU move : " + randomHand);

            if (yourMove.equals(randomHand)) {
                System.out.println("Its a neckTIE");
            } else if (yourMove.equals(threeHands[0])) {

                if (randomHand.equals(threeHands[1])) {
                    System.out.println("LOSER");
                } else if (randomHand.equals(threeHands[2])) {
                    System.out.println("WINNER WINNER CHICKEN DINNER");
                }
            } else if (yourMove.equals(threeHands[1])) {
                if (randomHand.equals(threeHands[0])) {
                    System.out.println("WINNER WINNER CHICKEN DINNER");
                } else if (randomHand.equals(threeHands[2])) {
                    System.out.println("LOSER");
                }
            } else if (yourMove.equals(threeHands[2])) {
                if (randomHand.equals(threeHands[1])) {
                    System.out.println("WINNER WINNER CHICKEN DINNER");
                } else if (randomHand.equals(threeHands[0])) {
                    System.out.println("LOSER");
                }
            }
        }
    }
}
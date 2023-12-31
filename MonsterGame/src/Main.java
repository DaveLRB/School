import java.util.Scanner;

/*Two players can play this game.
When the game starts, each player will be asked to pick a number of monsters to play with. Both players have to pick the same number of monsters.
In every round, the attacker player picks one monster to perform the attack. The other player picks one of their monster to suffer the hit. Both picks are random.
The game goes on until one of the players loses all their monsters.

A  player has a predefined number of monsters to play with.
Every time a player is attacked, they should check if there's still any monster left alive to play with. When there's no more monsters, the player loses the game.

Werewolf is a type of monster.
When a Werewolf attacks, it always inflicts the same amount of damage.
When a Werewolf is hit, it always loses health.

Vampire is a type of monster.
When a Vampire attacks, it always inflicts the same amount of damage. However, there is a chance that, when it attacks, the vampire bites its enemy. When that happens, the vampire's health will increase a certain amount.
When a vampire is hit, it always loses health.

Mummy is a type of monster.
A Mummy can only perform two consecutive attacks. If a Mummy tries to attack a third time, it fails, unrolls, and loses a certain amount of health. The attacking ability of the Mummy is then restored.
When a Mummy is hit, it always loses health.*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameManager game = new GameManager();

        System.out.println("=========================");
        System.out.println("Welcome to Halloween Town");
        System.out.println("1 - Play Game");
        System.out.println("0 - Exit Game");
        String option = input.nextLine();

        switch (option){
            case "1":
                game.startTheGame();
                game.playGame();
                break;
            case "0":
                System.out.println("Leaving Halloween Town! Hope to see you soon!");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("\033[1;91m" + "Invalid option\n Input valid option" + "\033[0m");
                break;

        }

    }
}
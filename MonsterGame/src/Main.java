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

        GameManager game = new GameManager();

        game.addP1Monsters(new Werewolf("White Wolf", 100));
        game.addP1Monsters(new Vampire("Brigth Dracula", 80));
        game.addP1Monsters(new Mummy ("Imothep IV", 110));

        game.addP2Monsters(new Werewolf("Black Wolf", 100));
        game.addP2Monsters(new Vampire("Vlad Dracul", 80));
        game.addP2Monsters(new Mummy("Ramses II", 110));

        game.playGame();

    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager {

    private final List<Monster> player1Monsters;
    private final List<Monster> player2Monsters;

    public GameManager() {
        player1Monsters = new ArrayList<>();
        player2Monsters = new ArrayList<>();

    }

    public void addP1Monsters(Monster monster) {
        player1Monsters.add(monster);
    }

    public void addP2Monsters(Monster monster) {
        player2Monsters.add(monster);
    }

    public void playGame (){
        Random random = new Random();
        int numberOfRounds = 1;

        while (!player1Monsters.isEmpty() && !player2Monsters.isEmpty()){
            System.out.println("Round " + numberOfRounds + " begins!");

            int p1AttackerIndex = random.nextInt(player1Monsters.size());
            Monster p1Attacker = player1Monsters.get(p1AttackerIndex);

            int p2DefenderIndex = random.nextInt(player2Monsters.size());
            Monster p2Defender = player2Monsters.get(p2DefenderIndex);

            int damage = p1Attacker.monsterAttacks();
            p2Defender.takeDamage(damage);

            System.out.println(p1Attacker.monsterName + " attacks " + p2Defender.monsterName + " with " + damage + " damage!");

            if (!p2Defender.isMonsterAlive()) {
                player2Monsters.remove(p2DefenderIndex);
                System.out.println(p2Defender.monsterName + " is defeated!");
            }

            int p2AttackerIndex = random.nextInt(player2Monsters.size());
            Monster p2Attacker = player2Monsters.get(p2AttackerIndex);

            int p1DefenderIndex = random.nextInt(player1Monsters.size());
            Monster p1Defender = player1Monsters.get(p1DefenderIndex);

            damage = p2Attacker.monsterAttacks();
            p1Defender.takeDamage(damage);

            System.out.println(p2Attacker.monsterName + " attacks " + p1Defender.monsterName + " with " + damage + " damage!");

            if (!p1Defender.isMonsterAlive()) {
                player1Monsters.remove(p1DefenderIndex);
                System.out.println(p1Defender.monsterName + " is defeated!");
            }
            numberOfRounds++;

        }

        if (player1Monsters.isEmpty()){
            System.out.println("PLAYER 2 WINS!");
        }else{
            System.out.println("PLAYER 1 WINS!");
        }

    }

}

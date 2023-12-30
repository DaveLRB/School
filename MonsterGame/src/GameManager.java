import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

    private final List<Monster> player1Monsters;
    private final List<Monster> player2Monsters;
    private final List<Supernatural> player1Supernatural;
    private final List<Supernatural> player2Supernatural;
   Scanner input = new Scanner(System.in);

    public GameManager() {
        player1Monsters = new ArrayList<>();
        player2Monsters = new ArrayList<>();
        player1Supernatural= new ArrayList<>();
        player2Supernatural = new ArrayList<>();

    }

    public void addP1Monsters(Monster monster) {
        player1Monsters.add(monster);

    }

    public void addP2Monsters(Monster monster) {
        player2Monsters.add(monster);

    }

    public void addP1Supernaturals(Supernatural supernatural){
        player1Supernatural.add(supernatural);
    }
    public void addP2Supernaturals(Supernatural supernatural){
        player2Supernatural.add(supernatural);
    }

    public void startTheGame(){
        System.out.println("P1 add monsters:");
        addMonstersPlayer(1);
        System.out.println("P1 add supernaturals:");
        addSupernaturalsPlayer(1);
        System.out.println("P2 add monsters:");
        addMonstersPlayer(2);
        System.out.println("P1 add supernaturals:");
        addSupernaturalsPlayer(2);
    }

    private void addMonstersPlayer(int playerNumber){
        System.out.println("Enter the number of monsters for Player " + playerNumber + ":");
        int numMonsters = input.nextInt();
        input.nextLine();

        for (int i = 0; i< numMonsters; i++){
            System.out.println("Enter monster type for Monster " + (i + 1) + " (Werewolf, Vampire, or Mummy):");
            String monsterType = input.nextLine();

            System.out.println("Enter monster name:");
            String monsterName = input.nextLine();

            System.out.println("Enter monster health:");
            int monsterHealth = input.nextInt();
            input.nextLine();

            switch (monsterType.toLowerCase()){
                case"werewolf":
                    if (playerNumber == 1){
                        addP1Monsters(new Werewolf(monsterName, monsterHealth));
                    }else {
                        addP2Monsters(new Werewolf(monsterName, monsterHealth));
                    }
                    break;
                case "vampire":
                    if (playerNumber == 1){
                        addP1Monsters(new Vampire(monsterName,monsterHealth));
                    }else{
                        addP2Monsters(new Vampire(monsterName,monsterHealth));
                    }
                    break;
                case"mummy":
                    if (playerNumber == 1){
                        addP1Monsters(new Mummy(monsterName,monsterHealth));
                    }else{
                        addP2Monsters(new Mummy(monsterName,monsterHealth));
                    }
                    break;
                default:
                    System.out.println("Invalid monster type entered. Please enter Werewolf, Vampire, or Mummy.");
                    i--;
                    break;


            }
        }


    }

    private void addSupernaturalsPlayer(int playerNumber){
        System.out.println("Enter the number of Supernaturals for Player " + playerNumber + ":");
        int numMonsters = input.nextInt();
        input.nextLine();

        for (int i = 0; i< numMonsters; i++){
            System.out.println("Enter Supernatural type for Supernatural " + (i + 1) + " (Witch , Fairy):");
            String supernaturalType = input.nextLine();

            System.out.println("Enter Supernatural name:");
            String supernaturalName = input.nextLine();

            System.out.println("Enter Supernatural health:");
            int supernaturalHealth = input.nextInt();
            input.nextLine();

            switch (supernaturalType.toLowerCase()){
                case"witch":
                    if (playerNumber == 1){
                        addP1Supernaturals(new Witch(supernaturalName, supernaturalHealth));
                    }else {
                        addP2Supernaturals(new Witch(supernaturalName, supernaturalHealth));
                    }
                    break;
                case "vampire":
                    if (playerNumber == 1){
                        addP1Supernaturals(new Fairy(supernaturalName, supernaturalHealth));
                    }else{
                        addP2Supernaturals(new Fairy(supernaturalName, supernaturalHealth));
                    }
                    break;
                default:
                    System.out.println("Invalid supernatural type entered. Please enter Witch or Fairy.");
                    i--;
                    break;


            }
        }


    }



    private void p1AttacksLogic(){
        Random random = new Random();

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
    }
    private void p2AttacksLogic(){
        Random random = new Random();

        int p2AttackerIndex = random.nextInt(player2Monsters.size());
        Monster p2Attacker = player2Monsters.get(p2AttackerIndex);

        int p1DefenderIndex = random.nextInt(player1Monsters.size());
        Monster p1Defender = player1Monsters.get(p1DefenderIndex);

        int damage = p2Attacker.monsterAttacks();
        p1Defender.takeDamage(damage);

        System.out.println(p2Attacker.monsterName + " attacks " + p1Defender.monsterName + " with " + damage + " damage!");

        if (!p1Defender.isMonsterAlive()) {
            player1Monsters.remove(p1DefenderIndex);
            System.out.println(p1Defender.monsterName + " is defeated!");
        }
    }

    public void playGame (){

        int numberOfRounds = 1;

        while (!player1Monsters.isEmpty() && !player2Monsters.isEmpty()){
            System.out.println("Round " + numberOfRounds + " begins!");
            p1AttacksLogic();
            p2AttacksLogic();
            numberOfRounds++;
        }

        if (player1Monsters.isEmpty()){
            System.out.println("PLAYER 2 WINS!");
        }else{
            System.out.println("PLAYER 1 WINS!");
        }

    }

}

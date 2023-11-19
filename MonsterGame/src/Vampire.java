import java.util.Random;

class Vampire extends Monster {
    private int damageDone = 10;
    private int biteHealChance = 30;

    public Vampire(String monsterName, int monstersHealth) {
        super(monsterName, monstersHealth);
    }

    @Override
    int monsterAttacks() {
        if(new Random().nextInt(100)< biteHealChance){
            int amountHealed = 25;
            monstersHealth += amountHealed;
            System.out.println(monsterName + " blood healed!");
        }
        return damageDone;
    }

    @Override
    void takeDamage(int damageDone) {
        monstersHealth -= damageDone;

    }


}

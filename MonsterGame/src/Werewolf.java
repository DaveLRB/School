class Werewolf extends Monster{

    int damageDone = 20;

    public Werewolf(String monsterName, int monstersHealth) {
        super(monsterName, monstersHealth);
    }

    @Override
    int monsterAttacks() {
        return damageDone;
    }

    @Override
    void takeDamage(int damageDone) {
        monstersHealth -= damageDone;
    }

}

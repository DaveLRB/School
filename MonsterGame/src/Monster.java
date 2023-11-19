abstract class Monster {

    String monsterName;
    int monstersHealth;

    public Monster(String monsterName, int monstersHealth) {
        this.monsterName = monsterName;
        this.monstersHealth = monstersHealth;
    }

    abstract int monsterAttacks();

    abstract void takeDamage(int damageDone);

    boolean isMonsterAlive(){
        return monstersHealth>0;
    }


}

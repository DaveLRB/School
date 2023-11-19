class Mummy extends Monster{
    int damagedDone=10;
    int maximumAttacks=2;
    int attacksLeft;

    public Mummy(String monsterName, int monstersHealth) {
        super(monsterName, monstersHealth);
        attacksLeft=maximumAttacks;
    }

    @Override
    int monsterAttacks() {
        if (attacksLeft>0){
            attacksLeft--;
            return damagedDone;
        }else{
            System.out.println(monsterName + " can't attack no more!!");
        }
        return 0;
    }

    @Override
    void takeDamage(int damageDone) {
        monstersHealth-=damageDone;
        if (attacksLeft<maximumAttacks){
            attacksLeft=maximumAttacks;
        }

    }
}

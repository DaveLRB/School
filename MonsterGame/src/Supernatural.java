abstract class Supernatural {

    String supernaturalName;
    int supernaturalHealth;

    public Supernatural(String supernaturalName, int supernaturalHealth) {
        this.supernaturalName = supernaturalName;
        this.supernaturalHealth = supernaturalHealth;
    }

    abstract int supernaturalAttacks();

    abstract void takeDamage(int damageDone);

    boolean isSupernaturalAlive(){
        return supernaturalHealth>0;
    }


}


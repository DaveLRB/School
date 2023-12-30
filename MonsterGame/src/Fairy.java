public class Fairy extends Supernatural{
    public Fairy(String supernaturalName, int supernaturalHealth) {
        super(supernaturalName, supernaturalHealth);
    }

    @Override
    int supernaturalAttacks() {
        return 0;
    }

    @Override
    void takeDamage(int damageDone) {

    }
}

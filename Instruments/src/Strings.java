public class Strings extends Instrument{

  protected int numberStrings;

    public Strings(int numberStrings, boolean isEletric) {
        super(isEletric);
        this.numberStrings = numberStrings;
    }

    public String toString(){
        return "NumString : " + numberStrings + "Eletric" + isEletric;
    }
}



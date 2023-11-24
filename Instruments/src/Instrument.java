public class Instrument {

   protected boolean isEletric;

    public Instrument(boolean isEletric) {
        this.isEletric =isEletric;
    }


    public String toString(){
        return "Instrument : " + isEletric;
    }
}

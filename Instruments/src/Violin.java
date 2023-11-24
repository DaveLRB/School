public class Violin extends Strings {

    private boolean isStarivari;
    public Violin(int numberStrings, boolean isEletric,boolean isStarivari) {
        super(numberStrings,isEletric);
        this.isStarivari=isStarivari;
    }



    @Override
    public String toString() {
        return "NumString : " + numberStrings + "Eletric" + isEletric + "Stradi" + isStarivari;
    }
}

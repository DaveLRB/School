import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};
            int sizeArray = musicians.length;

            for (int i = musicians.length - 1;i>0;i--){
                int randomI = (int) (Math.random()* (i+1));
                String temp = musicians[i];
                musicians[i] = musicians[randomI];
                musicians[randomI] = temp;
            }

    }




    }



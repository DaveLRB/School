
public class Main {
    public static void main(String[] args) {

        String [] Jedis ={ "Anakin Skywalker" , "Luke Skywalker" , " Master Yoda" ,"Ahsoka Tano" , " Master Manuel Joaquim"};
            for ( int i = 0; i < Jedis.length; i++) {
                if (Jedis[i].endsWith("Skywalker")){
                    System.out.println("May the force be with you chosen one!");
                    continue;


                }

                if (Jedis [i].endsWith("Yoda")) {
                    System.out.println("Found you, Master!");
                    break;
                }


            }

    }
}


public class Main {
    public static void main(String[] args) {

        testDish("Bob Dylan", "beef wellington");
        testDish("Mick Jagger", "mushroom soup");
    }

    public static void testDish(String musicianName, String dish) {
        // match first and last letters of name and dish

        char musiC = musicianName.toLowerCase().charAt(0);
        char plate = dish.charAt(0);
        char musicI = musicianName.charAt(musicianName.length() - 1);
        char plateI = dish.charAt(dish.length() - 1);

        boolean sEE = musiC == plate && musicI == plateI;
        System.out.println(sEE);

        /*if (music == plate && musicI == plateI) {
            System.out.println("True");
        } else {
            System.out.println("False");*/
    }
}





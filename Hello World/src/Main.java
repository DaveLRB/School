import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random randomize = new Random();
        //String missMissed = "❌";
        //String fireHot = "💥";
        int rowsOfMines = 5;
        int collumnsOfMines = 5;

        int[][] mineField = new int[collumnsOfMines][rowsOfMines];

        for (int i = 0; i < rowsOfMines; i++) {
            for (int j = 0; j < collumnsOfMines; j++) {
                int randoM = randomize.nextInt(2);
                mineField[i][j] = randoM;
                if (mineField[i][j] == 0) {
                    System.out.print("\t❌");
                } else {
                    System.out.print("\t💥");

                }

            }
            System.out.println();

        }
    }
}





























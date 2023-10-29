import java.util.*;
public class Main {
    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "David","Eve", "Fred", "Ginny","Harriet","Ileana","Joseph","Kincaid", "Larry"};
        //char[] firstRow = {'V', 'R', 'C', 'G', 'V', 'V'};
        //char[] secondRow = {'V', 'R', 'C', 'G', 'V', 'V'};
        char[][] rowsOfSeeds = {{'V','R','C','G','V','V','R','V','C','G','G','C','C','G','V','R','G','C','V','C','G','C','G','V'},
                {'V','R','C','C','C','G','C','R','R','G','V','C','G','C','R','V','V','C','V','G','C','G','C','V'}};
        Scanner input = new Scanner(System.in);
        System.out.println("Input the student name : ");
        String name = input.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                int studentFirstSeedIndex = i * 2;
                int studentSecondSeedIndex = studentFirstSeedIndex + 1;
                for (int j = 0; j < rowsOfSeeds.length; j++) {
                    char firstSeed = rowsOfSeeds[j][studentFirstSeedIndex];
                    char secondSeed = rowsOfSeeds[j][studentSecondSeedIndex];
                    System.out.println(firstSeed + " , " + secondSeed);
                }



            }


        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correctName = false;
        while (!correctName) {
            System.out.println("Please input one of the characters : ");
            System.out.println(" - Darth Maul");
            System.out.println(" - Master Kenobi");
            System.out.println(" - Master Yoda");
            System.out.println(" - Chewbacca");
            System.out.println(" - Master Qui Gon Jin");
            System.out.println(" - Din Djarin");
            System.out.println(" - Admiral Akhbar");

            String inputName = scanner.nextLine();

            switch (inputName) {
                case "Darth Maul":
                    System.out.println("\u001b[31m" + "\u001b[40;1m" + "KENOBIIIIII" + "\u001b[0m");
                    break;
                case "Master Kenobi":
                    System.out.println("\u001b[34;1m" + "\u001b[47m" + "I have the high ground " + "\u001b[0m");
                    break;
                case "Master Yoda":
                    System.out.println("\u001b[32m" + "Do or do not. There is no trys!" + "\u001b[0m");
                    break;
                case "Chewbacca":
                    System.out.println("\u001b[32;1m" + "Wyaaaaaa, Ruh Ruh? (Hello, how are you?)" + "\u001b[0m");
                    break;
                case "Master Qui Gon Jin":
                    System.out.println("\u001b[37m" + "There is always bigger fish" + "\u001b[0m");
                    break;
                case "Din Djarin":
                    System.out.println("\u001b[34;1m" + "This is the way" + "\u001b[0m");
                    break;
                case "Admiral Akhbar":
                    System.out.println("\u001b[32;1m" + "Its a trap" + "\u001b[0m");
                    break;
                default:
                    System.out.println("Put correct name!");

            }
        }

        scanner.close();
    }
}

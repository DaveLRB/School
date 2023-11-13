import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        SimpleBear simplebear = new SimpleBear();
        CrankyBear crankybear = new CrankyBear();
        DrunkBear drunkbear = new DrunkBear();
        TheShop theshop = new TheShop();
        while (true) {
            int randomBattery = random.nextInt(101);
            int randomProduction = random.nextInt(51);
        System.out.println("\033[1;97m" + "1- Create Bears" + "\033[0m");
        System.out.println("\033[1;97m" + "2- Hear Bears" + "\033[0m");
        System.out.println("\033[1;97m" + "3- Exit Teddy Bear Shop");
        System.out.println("\033[1;97m" + "Choose option please :" + "\033[0m");
        String option = input.nextLine();

            switch (option) {
                case "1":
                    theshop.setNumberOfBear(randomProduction);
                    theshop.bearFactory();
                    System.out.println("\033[1;97m" + "\nNumber of bears produced was : " + randomProduction + "\033[0m");
                    break;
                case "2":
                    System.out.println("\033[0;93m" + "Simple Bear says  " + "\033[0m");
                    simplebear.setBatteryBear(randomBattery);
                    simplebear.talks();
                    System.out.println("\033[0;93m" + "Cranky Bear says  " + "\033[0m");
                    crankybear.setBatteryBear(randomBattery);
                    crankybear.talks();
                    System.out.println("\033[0;93m" + "Drunk Bear says  " + "\033[0m");
                    drunkbear.setBatteryBear(randomBattery);
                    drunkbear.talks();
                    break;
                case "3":
                    System.out.println("\033[1;93m" + "Leaving Teddy Bear Shop! Hope to see you soon!" + "\033[0m");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\033[1;91m" + "Invalid option\n Input valid option" + "\033[0m");
                    break;
            }
        }
    }
}

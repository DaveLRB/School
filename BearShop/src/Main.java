import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomBattery = random.nextInt(101);
        int randomProduction = random.nextInt(51);
        SimpleBear simplebear = new SimpleBear();
        CrankyBear crankybear = new CrankyBear();
        DrunkBear drunkbear = new DrunkBear();
        TheShop theshop = new TheShop();

        System.out.println("1- Create Bear");
        System.out.println("2- Set and hear Bears");
        System.out.println("3- Exit shop");
        System.out.println("Choose option please :");
        String option = input.nextLine();
        switch (option) {
            case "1":
                System.out.println("Number of bears produced : ");
                theshop.setNumberOfBear(randomProduction);
                theshop.bearFactory();
                break;
            case "2":
                System.out.println("Power Simple Bear : ");
                simplebear.setBatteryBear(randomBattery);
                simplebear.talks();
                System.out.println("Power Cranky Bear : ");
                crankybear.setBatteryBear(randomBattery);
                crankybear.talks();
                System.out.println("Power Drunk Bear : ");
                drunkbear.setBatteryBear(randomBattery);
                drunkbear.talks();
                break;
            case "3":
                System.out.println("Leaving Bear Shop! Hope to see you soon!");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option\n Input valid option");
                break;
        }
    }
}

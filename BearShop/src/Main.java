import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
                theshop.setNumberOfBear(input.nextInt());
                theshop.bearFactory();
                break;
            case "2":
                System.out.println("Power Simple Bear : ");
                simplebear.setBatteryBear(input.nextInt());
                simplebear.talks();
                System.out.println("Power Cranky Bear : ");
                crankybear.setBatteryBear(input.nextInt());
                crankybear.talks();
                System.out.println("Power Drunk Bear : ");
                drunkbear.setBatteryBear(input.nextInt());
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

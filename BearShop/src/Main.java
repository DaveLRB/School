import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        SimpleBear simplebear = new SimpleBear();
        CrankyBear crankybear = new CrankyBear();
        DrunkBear drunkbear = new DrunkBear();

        System.out.println("Power Simple Bear : ");
        simplebear.setBatteryBear(input.nextInt());
        System.out.println("Power Cranky Bear : ");
        crankybear.setBatteryBear(input.nextInt());
        System.out.println("Power Drunk Bear : ");
        drunkbear.setBatteryBear(input.nextInt());

        simplebear.talks();
        crankybear.talks();
        drunkbear.talks();

    }
}
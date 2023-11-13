public class SimpleBear {
    private int batteryBear;

    public int getBatteryBear() {
        return batteryBear;
    }

    public void setBatteryBear(int batteryBear) {
        this.batteryBear = batteryBear;
    }

    public SimpleBear() {

    }

    public void energyBearOut() {
        if (batteryBear == 0) {
            System.out.println("\033[1;91m" + "Out of power" + "\033[0m");
        }

    }

    public void talks() {
        if (batteryBear <= 0) {
            energyBearOut();
        } else {
            System.out.println("\033[0;31m" + "I LOVE YOU!!!" + "\033[0m");
        }


    }
}


public class SimpleBear {
    private int batteryBear;


    public int getBatteryBear() {
        return batteryBear;
    }

    public void setBatteryBear(int batteryBear) {
        this.batteryBear = batteryBear;
    }

    public SimpleBear() {
        this.batteryBear = 100;

    }

    public void energyBearOut() {
        if (batteryBear == 0) {
            System.out.println("Out of power");
        }

    }

    public void talks() {
        if (batteryBear <= 0) {
            energyBearOut();
        } else {
            System.out.println("I LOVE YOU!!!");
        }


    }
}


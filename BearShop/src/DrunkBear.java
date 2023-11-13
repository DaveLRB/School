public class DrunkBear extends SimpleBear{


    public void snoringBear() {
        System.out.println("\033[0;92m" + "RO RO RO RO" + "\033[0m");
    }
    @Override
    public void talks() {
        if(getBatteryBear()>=20){
            super.talks();
        } else if (getBatteryBear()<20 && getBatteryBear()>0) {
            snoringBear();
        }else {
            energyBearOut();
        }
    }
    }


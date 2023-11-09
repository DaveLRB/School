public class DrunkBear extends SimpleBear{


    public void snoringBear() {
        System.out.println("RO RO RO RO");
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


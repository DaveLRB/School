public class CrankyBear extends SimpleBear {


    public void singingBear(){
        System.out.println("Olerilole Olerilola");
    }

    @Override
    public void talks() {
        if(getBatteryBear()>=50){
        super.talks();
    } else if (getBatteryBear()<50 && getBatteryBear()>0) {
            singingBear();
        }else {
            energyBearOut();
        }
    }
}

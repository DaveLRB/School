public class CrankyBear extends SimpleBear {


    public void singingBear(){
        System.out.println("\033[0;96m" + "Olerilolé Olerilolá" + "\033[0m");
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

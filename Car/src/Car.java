class Car {

    String brand;
    String color;
    String model;
    String licensePlate;
    String fuelGauge;
    int fuelLevel;

    public Car(String brand, String color, String model, String licensePlate, String fuelGauge){
        this.brand = brand;
        this.color = color;
        this.fuelLevel = 100;
        this.fuelGauge = fuelGauge;
        this.licensePlate = licensePlate;
    }

    public void showColor(){
        System.out.println(this.color);
    }
    public void showBrand(){
        System.out.println(this.brand);
    }

    public void accelerate(){
        if (fuelLevel<0) {
            System.out.println("Stranded my friend!");
            return;
        }
        fuelLevel--;
        System.out.println("Vrummmm!");
    }
    public void getRefueled(){
        fuelLevel=100;
    }
    public void getRefueled(int fuelLevel){
        this.fuelLevel += fuelLevel;
        System.out.println("Fuel is full");
    }
    public void showGas() {
        System.out.println(fuelGauge);
    }
    public void showLicense(){
            System.out.println(licensePlate);
        }
    }



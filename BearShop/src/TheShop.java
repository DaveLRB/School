public class TheShop {
    private int numberOfBear;

    public TheShop() {
        this.numberOfBear = numberOfBear;
    }

    public void setNumberOfBear(int numberOfBear) {
        this.numberOfBear = numberOfBear;
    }

    public void bearFactory() {
        for (int i = 0; i< numberOfBear; i++){
            if (i % 2 == 0) {
                System.out.println("Simple Bear");
            } else if (i % 5 == 0) {
                System.out.println("Cranky Bear");
            } else {
                System.out.println("Drunk Bear");
            }

        }
    }
}


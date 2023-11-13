public class TheShop {
    private int numberOfBear;

    public void setNumberOfBear(int numberOfBear) {
        this.numberOfBear = numberOfBear;
    }

    public void bearFactory() {
        for (int i = 0; i < numberOfBear; i++) {
            if (i % 2 == 0) {
                System.out.println("\033[0;34m" + "Simple Bear" + "\033[0m");
            } else if (i % 5 == 0) {
                System.out.println("\033[0;97m" + "Cranky Bear" + "\033[0m");
            } else {
                System.out.println("\033[0;31m" + "Drunk Bear" + "\033[0m");
            }

        }
    }
}



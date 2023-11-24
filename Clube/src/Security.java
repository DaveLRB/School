public class Security extends Staff {
    private int trespasses;

    public Security(double baseSalary) {
        super(2000);
        this.trespasses = 0;
    }

    public void fieldTrespassing() {
        trespasses++;
    }

    @Override
    public double annualSalary() {
        double deductions = 20 * trespasses;
        double finalSalary = super.baseSalary - deductions;
        return finalSalary < 1000 ? 1000 : finalSalary;
    }
}

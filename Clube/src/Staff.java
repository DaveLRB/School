public class Staff extends Club {
    protected double baseSalary;

    public Staff(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double annualSalary() {
        return baseSalary * 14;
    }
}

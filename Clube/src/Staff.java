public abstract class Staff extends Club {
    protected double baseSalary;

    public Staff(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public abstract double annualSalary();


}

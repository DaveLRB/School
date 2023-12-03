public class Security extends Staff {
    private int invasions;
    private Club club;


    public Security(double baseSalary,Club club) {
        super(baseSalary,club);
        this.invasions = 0;
        this.club=club;

    }

    public void fieldInvasions() {
        invasions++;
    }

    @Override
    public double annualSalary() {
        
        double deductions = 20 * invasions;
        double finalSalary = (super.baseSalary*14) - deductions;
        return Math.max(finalSalary, 1000);
    }



}

public class Coach extends Staff {
    public Coach(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.baseSalary * 1.2;
        } else {
            return super.baseSalary * 1.1;
        }
    }
}




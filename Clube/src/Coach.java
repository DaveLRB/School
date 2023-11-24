public class Coach extends Staff {
    public Coach(double baseSalary) {
        super(100000);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.annualSalary() * 1.2;
        } else {
            return super.annualSalary() * 1.1;
        }
    }
}




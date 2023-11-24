public class Player extends Staff {
    public Player(double baseSalary) {
        super(150000);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.annualSalary() * 1.1;
        } else {
            return super.annualSalary() * 1.05;
        }
    }
}


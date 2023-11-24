public class Player extends Staff {
    public Player(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.baseSalary * 1.1;
        } else {
            return super.baseSalary * 1.05;
        }
    }


}


public class President extends Staff {
    public President(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.baseSalary + 50000;
        } else {
            return super.baseSalary;
        }
    }
}

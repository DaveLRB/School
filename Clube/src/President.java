public class President extends Staff {
    public President(double baseSalary) {
        super(80000);
    }

    @Override
    public double annualSalary() {
        if (this.isLeagueWon()) {
            return super.annualSalary() + 50000;
        } else {
            return super.annualSalary();
        }
    }
}

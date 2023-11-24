public class BallCatcher extends Staff {
    private int gamesPlayed;

    public BallCatcher(double baseSalary) {
        super(50);
        this.gamesPlayed = 0;
    }

    public void amountGamesPlayed() {
        gamesPlayed++;
    }

    @Override
    public double annualSalary() {
        double bonus = 20 * gamesPlayed;
        return super.annualSalary() + bonus;
    }
}
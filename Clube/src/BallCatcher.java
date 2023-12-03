public class BallCatcher extends Staff {
    private int gamesPlayed;
    private Club club;

    public BallCatcher(double baseSalary,Club club) {
        super(baseSalary,club);
        this.gamesPlayed = 0;
        this.club=club;

    }

    public void amountGamesPlayed() {
        gamesPlayed++;
    }

    @Override
    public double annualSalary() {
        int bonus = 20 * gamesPlayed;
        return (super.baseSalary*14) + bonus;
    }
}
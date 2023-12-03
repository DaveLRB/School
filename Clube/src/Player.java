public class Player extends Staff {

    public Player(double baseSalary, Club club) {
        super(baseSalary, club);
    }

    @Override
    public double annualSalary() {
        if (getClub().isLeagueWon()) {
            applyBonusPercent(baseSalary * 14, 10);
        }
        return applyBonusPercent(baseSalary * 14, 5);

    }
}




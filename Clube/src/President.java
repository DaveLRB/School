public class President extends Staff {

    public President(double baseSalary, Club club) {
        super(baseSalary,club);

    }

    @Override
    public double annualSalary() {
        if (getClub().isLeagueWon()) {
            applyBonusFix(baseSalary * 14,50000);
        }
            return super.baseSalary*14;
    }



}

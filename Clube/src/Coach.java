public class Coach extends Staff {

    public Coach(double baseSalary, Club club) {
        super(baseSalary, club);
    }

    @Override
    public double annualSalary() {
        if (getClub().isLeagueWon()) {
            applyBonusPercent(baseSalary*14,20);
        }
            return applyBonusPercent(baseSalary*14,10);
        }
    }







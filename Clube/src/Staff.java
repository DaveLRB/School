public abstract class Staff{
    protected double baseSalary;
    protected boolean isLeagueWon;



    public Staff(double baseSalary) {
        this.baseSalary = baseSalary;


    }

    public abstract double annualSalary();


    public boolean isLeagueWon() {
        return isLeagueWon;
    }

    public void setLeagueWinner(boolean leagueWinner) {
        this.isLeagueWon = leagueWinner;
    }


}

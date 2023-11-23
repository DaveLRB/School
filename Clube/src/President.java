public class President extends Staff {


    public President(double salary, double bonus) {
        super(salary, bonus);
        this.salary = 100000;
        this.bonus = 50000;
    }

    @Override
    double salaryPerYear() {
        return salary * MONTHS_WORK;
    }

    @Override
    public boolean leagueWon() {
        return super.leagueWon();

    }
}

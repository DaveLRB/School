public class Player extends Staff {


    public Player(double salary, double bonus) {
        super(salary, bonus);
        this.salary = 500000;
        this.bonus = 1.1;


    }

    @Override
    double salaryPerYear() {
        return salary * MONTHS_WORK;
    }

    @Override
    public boolean leagueWon() {
        double totalSalary;
        if (leagueWon()) {
            totalSalary = salaryPerYear() * bonus;
            System.out.println(totalSalary);
        } else {
            totalSalary = salaryPerYear() * 1.05;
            System.out.println(totalSalary);
        }
        return false;
    }

}


public class Coach extends Staff {


    public Coach(double salary, double bonus) {
        super(salary, bonus);
        this.salary = 120000;
        this.bonus = 1.2;
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
            totalSalary = salaryPerYear() * 1.1;
            System.out.println(totalSalary);
        }
        return false;
    }
}


abstract class Staff {

    public double salary;
    public double bonus;
    public static final int MONTHS_WORK = 14;
    public boolean isLeagueWon;

    public Staff(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    abstract double salaryPerYear();


    public boolean leagueWon() {
        if (isLeagueWon) {
            double totalSalary = salaryPerYear() + bonus;
            System.out.println("Total Salary: " + totalSalary);
            return true;
        } else {
            return false;
        }
    }

}

abstract class Staff {

    public int salary;
    public int bonus;

    public Staff(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int salaryPerYear(){

        return salary*14;
    }

    public boolean leagueWon(){
        if (leagueWon()){
            int totalSalary= salaryPerYear() + bonus;
        }else{
            salaryPerYear();
        }
        return false;
    }

}

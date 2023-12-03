public abstract class Staff implements Bonus {
    protected double baseSalary;
    private Club club;
    private Bonus bonus;

    public Staff(double baseSalary, Club club) {
        this.baseSalary = baseSalary;
        this.club = club;
    }

    public abstract double annualSalary();

    public Club getClub() {
        return club;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    @Override
    public double applyBonusFix(double baseSalary, int fixedAmountBonus) {
        return baseSalary + fixedAmountBonus;
    }

    @Override
    public double applyBonusPercent(double baseSalary, int bonusPercentage) {
        return baseSalary * (1 + bonusPercentage / 100.0);
    }

}

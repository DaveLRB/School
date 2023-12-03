import java.util.ArrayList;
import java.util.List;

public class Club {

    private boolean isLeagueWon;
    private String clubName;
    private int yearOfBirth;
    private int winningsPerGame;




    public Club() {
        this.isLeagueWon = false;
        this.staffWithContract = new ArrayList<>();
        this.staffWithoutContract = new ArrayList<>();

    }


    List<Staff> staffWithContract;
    List<Staff> staffWithoutContract;

    public Club(StaffType staffType) {
        staffWithoutContract.add(StaffFactory.getStaff(StaffType.SECURITY,5000));
        staffWithoutContract.add(StaffFactory.getStaff(StaffType.BALLCATCHER,500));

        staffWithContract.add(StaffFactory.getStaff(StaffType.PRESIDENT, 30000));
        staffWithContract.add(StaffFactory.getStaff(StaffType.PLAYER, 90000));
        staffWithContract.add(StaffFactory.getStaff(StaffType.COACH, 50000));
    }

    public void setWinningsPerGame(int winningsPerGame) {
        this.winningsPerGame = winningsPerGame;
    }

    public int calculateExpenses() {
        int totalExpenses = 0;

        for (Staff staff : staffWithContract) {
            totalExpenses += (int) staff.annualSalary();
        }

        for (Staff staff : staffWithoutContract) {
            totalExpenses += (int) staff.annualSalary();
        }

        return totalExpenses;
    }

    public int calculateProfit(int gamesPlayed) {
        int totalWinnings = gamesPlayed * winningsPerGame;
        int totalExpenses = calculateExpenses();
        int profit = totalWinnings - totalExpenses;

        return profit;
    }

    public void addStaffHired(Staff staff, boolean withContract) {
        if (withContract) {
            staffWithContract.add(staff);
        } else {
            staffWithoutContract.add(staff);
        }
    }



    public boolean isLeagueWon() {
        return isLeagueWon;
    }

    public void setLeagueWinner(boolean leagueWinner) {
        this.isLeagueWon = leagueWinner;
    }
}



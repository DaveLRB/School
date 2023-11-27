import java.util.List;

public class Club {

    String clubName;
    int YearOfBirth;

    public Club(String clubName, int yearOfBirth) {
        this.clubName = clubName;
        YearOfBirth = yearOfBirth;
    }

    List<Staff> allStaff;

    public Club(StaffType staffType) {
        allStaff.add(StaffFactory.getStaff(StaffType.PRESIDENT, 10000));
        allStaff.add(StaffFactory.getStaff(StaffType.PLAYER, 50000));
        allStaff.add(StaffFactory.getStaff(StaffType.COACH, 500));
    }


}




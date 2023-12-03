public class StaffFactory {

    public static Staff getStaff(StaffType staffType, int baseSalary) {

        switch (staffType){
            case PRESIDENT:
                return new President(baseSalary, new Club());
            case PLAYER:
                return new Player(baseSalary, new Club());
            case COACH:
                return new Coach(baseSalary, new Club());
            case SECURITY:
                return new Security(baseSalary, new Club());
            case BALLCATCHER:
                return new BallCatcher(baseSalary, new Club());
        }


        return null;
    }
}

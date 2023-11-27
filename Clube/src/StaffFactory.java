public class StaffFactory {

    public static Staff getStaff(StaffType staffType, double baseSalary) {

        switch (staffType){
            case PRESIDENT:
                return new President(baseSalary);
            case PLAYER:
                return new Player(baseSalary);
            case COACH:
                return new Coach(baseSalary);
            case SECURITY:
                return new Security(baseSalary);
            case BALLCATCHER:
                return new BallCatcher(baseSalary);
        }


        return null;
    }
}

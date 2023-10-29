public class User {


    private String nameID;
    private String userName;
    private int userAge;
    private String userPassword;


    public User(String userName, int userAge, String userPassword, String yourRole) {
        this.userName = userName;
        this.userAge = userAge;
        this.userPassword = userPassword;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}





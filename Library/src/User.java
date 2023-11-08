public class User {

    public String userName;
    public int userAge;
    private String userPassword;
    public boolean isAdmin;

    public User(String userName, int userAge, String userPassword, boolean isAdmin) {
        this.userName = userName;
        this.userAge = userAge;
        this.userPassword = userPassword;
        this.isAdmin = true;
    }

    public User(String userName, int userAge, String userPassword) {
        this.userName = userName;
        this.userAge = userAge;
        this.userPassword = userPassword;


    }

    public String toString(){
        return "\033[33m" + " Username : " + "\033[0m" + userName + "\033[33m" + " Age : " + "\033[0m" + userAge
                + "\033[33m" + " Password : " + "\033[0m" + userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}





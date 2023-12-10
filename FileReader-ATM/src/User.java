public class User {

    private String name;
    private int accNumber;
    private double balance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public User(String name, int accNumber, double balance) {
        this.name = name;
        this.accNumber=accNumber;
        this.balance = balance;

    }

}

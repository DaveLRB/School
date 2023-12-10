import java.util.List;

public class ATM {
    private List<User> usersData;
    private String filePath;

    public ATM(List<User> usersData, String filePath) {
        this.usersData = usersData;
        this.filePath = filePath;
    }

    public boolean deposit(int accNumber, double amount) {
        for (User user : usersData) {
            if (user.getAccNumber() == accNumber) {
                double newBalance = user.getBalance() + amount;
                user.setBalance(newBalance);
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(int accNumber, double amount) {
        for (User user : usersData) {
            if (user.getAccNumber() == accNumber && user.getBalance() >= amount) {
                double newBalance = user.getBalance() - amount;
                user.setBalance(newBalance);
                return true;
            }
        }
        return false;
    }

    public boolean transfer(int fromAccNumber, int toAccNumber, double amount) {
        User fromUser = null;
        User toUser = null;

        for (User user : usersData) {
            if (user.getAccNumber() == fromAccNumber && user.getBalance() >= amount) {
                fromUser = user;
                break;
            }
        }

        for (User user : usersData) {
            if (user.getAccNumber() == toAccNumber) {
                toUser = user;
                break;
            }
        }

        if (fromUser != null && toUser != null) {
            double fromNewBalance = fromUser.getBalance() - amount;
            double toNewBalance = toUser.getBalance() + amount;

            fromUser.setBalance(fromNewBalance);
            toUser.setBalance(toNewBalance);
            return true;
        }
        return false;
    }

    public void updateFile(String filePath) {
        FileManagement FileWriterUtil = null;
        FileWriterUtil.writeToFile(filePath, this.usersData);
    }
}

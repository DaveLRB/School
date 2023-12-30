import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                updateFile(filePath);
                updateAuditLog("Deposit", user.getName(), accNumber, amount);
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
                updateFile(filePath);
                updateAuditLog("Withdraw", user.getName(), accNumber, amount);
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
            updateFile(filePath);
            updateAuditLog("Transfer", fromUser.getName(), fromAccNumber, amount);
            updateAuditLog("Transfer Received", toUser.getName(), toAccNumber, amount);
            return true;
        }
        return false;
    }

    private void updateAuditLog(String transactionType, String userName, int accountNumber, double amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("auditLog", true))) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);

            String logEntry = "[" + formattedDateTime + "] - " + userName + " - Account Number: " + accountNumber + " - " + transactionType + " " + String.format("%.2f", amount) + "\n";
            writer.write(logEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void updateFile(String filePath) {
        FileManagement FileWriterUtil = null;
        FileWriterUtil.writeToFile(filePath, this.usersData);
    }
}

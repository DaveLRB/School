
import java.io.*;
import java.util.ArrayList;
import java.util.List;

    public class FileManagement {
        private List<User> userData = new ArrayList<>();

        public void readFiles(String usersData) {
            try (BufferedReader buffer = new BufferedReader(new FileReader(usersData))) {
                String line;
                while ((line = buffer.readLine()) != null) {
                    String[] userDataArray = line.split("-");
                    if (userDataArray.length == 3) {
                        String name = userDataArray[0];
                        int accNumber = Integer.parseInt(userDataArray[1]);
                        double balance = Double.parseDouble(userDataArray[2]);

                        User user = new User(name, accNumber, balance);
                        userData.add(user);
                    } else {
                        System.out.println("Invalid data format: " + line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeToFile(String filePath, List<User> usersData) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (User user : usersData) {
                    String userData = user.getName() + "-" + user.getAccNumber() + "-" + user.getBalance();
                    writer.write(userData);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<User> getUserData() {
            return userData;
        }
    }

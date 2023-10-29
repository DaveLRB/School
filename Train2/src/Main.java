
public class Main {
    public static void main(String[] args) {

        generatePassword("Peter Gabriel"); // should print "G@br!el"
        generatePassword("Brian Adams"); // should print "@d@ms"
    }

    public static void generatePassword(String musicianName) {

        String[] lastName = musicianName.split(" ");
        String password = lastName[lastName.length - 1]
                .toLowerCase()
                .replaceAll("a", "@")
                .replaceAll("i", "!");
        System.out.println(password);
    }


}




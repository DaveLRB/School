
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 1, 8, 9, 1};
        int number = 1;
        int sameNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                sameNumber++;
            }
        }
        System.out.println(sameNumber);
    }
}


public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,-10,-7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}


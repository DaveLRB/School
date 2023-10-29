
public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 8, 10, 2};
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[position]) {
                position = i;
            }
        }
        System.out.println(position);
    }
}

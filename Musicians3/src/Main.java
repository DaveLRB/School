
public class Main {
    public static void main(String[] args) {
        //find the stolen number on a integer array

        int[] numbers = {1, 2, 3, 5, 6, 7, 9, 10, 12, 15, 16, 18};

        int start = numbers[0];
        int end = numbers[numbers.length - 1];
        boolean[] existNumber = new boolean[end - start + 1];

        for (int num : numbers) {
            existNumber[num - start] = true;
        }

        for (int i = start; i <= end; i++) {
            if (!existNumber[i - start]) {
                System.out.println("Missing number: " + i);
            }
        }
    }
}

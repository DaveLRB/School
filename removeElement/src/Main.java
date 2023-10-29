import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] array = {20, 6, 17, 4, 8, 90};
        int number = 90;
        int sameNumberIndex = 0;
        int countIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                sameNumberIndex++;
        }
        int[] arrayWithoutElement = new int[array.length - sameNumberIndex];
        for (int i = 0;i<array.length;i++){
            if(array[i] != number){
                arrayWithoutElement[countIndex]=array[i];
                countIndex++;


            }
        }
        System.out.println(Arrays.toString(arrayWithoutElement));

    }
}

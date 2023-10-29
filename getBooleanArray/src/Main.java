import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        {
            int[] array = {1, 5, -3, -7, 0, 3, -10, 9, -8};
            boolean[] positive = new boolean[array.length];
            for (int i = 0; i < array.length; i++) {
                positive[i] = array[i] > 0;
        /*if(array[i]>0){
        positive[i] = true;
        }else{
            positive[i]=false;
         */
            }
            System.out.println(Arrays.toString(positive));

        }

    }
}

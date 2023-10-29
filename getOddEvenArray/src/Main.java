import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int [] array = {1,4,6,4,5,8,0,12,11};
        for (int i = 0;i< array.length;i++){
            if(array[i] % 2 == 0){
                array[i] = 1;
            }else{
                array[i] = -1;
            }
        }
        System.out.println(Arrays.toString(array));

        }
    }

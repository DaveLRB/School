import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int [] array = {3,8,1,2,7,5,10,23};

       if (array.length == 0 || array.length == 1){
           System.out.println(Arrays.toString(array));
       }
        int count = 0;
       for (int i = 0; i< array.length;i++){
           for (int j = 0;j<array.length-1;j++){
               if(array[j]>array[j+1]){
                   count=array[j];
                   array[j]=array[j+1];
                   array[j+1]=count;
               }
           }
       }
        System.out.println(Arrays.toString(array));

    }
}
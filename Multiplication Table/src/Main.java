
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
        scan.close();
    }
}

    /*O programa deve pedir um número ao utilizador e com esse número voces devem fazer a tabuada até ao 10, exemplo:
        Utilizador -> 5
        0 * 5 = 0
        1 * 5 = 5
        2 * 5 = 10
        etc...*/
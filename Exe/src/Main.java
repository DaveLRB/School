import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a trash Mercedes Benz";


        Arrays.stream(prayer.split(" "))
                .filter(e -> !e.equals("trash"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(prayer);

       /*Arrays.stream(new String[]{prayer})
               .filter(e->!e.equals("trash"))
               .map(String::toUpperCase)
               .collect(Collectors.joining(" "));

        System.out.println(prayer);*/

        /* prayer = Arrays.stream(prayer.split(" "))
                .filter(e -> !e.equals("trash"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));

        System.out.println(prayer);*/


    }
}


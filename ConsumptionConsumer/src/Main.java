import java.util.ArrayList;
import java.util.List;

/*Create a functional interface named Action that defines an abstract method execute
which takes a String and prints it. Then, create a class Executor that has a
method executeAction which takes a list of strings and an instance of Action to execute
the action on each string in the list.
 */
public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Action action = (System.out::println);
        List<String> stringList = new ArrayList<>();

        stringList.add("nico");

        executor.executeAction(stringList,action);


        }
    }

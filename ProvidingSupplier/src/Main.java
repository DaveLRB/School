import java.util.ArrayList;
import java.util.List;

//Create a functional interface named Generator that defines an abstract method generate
// which takes no arguments and returns an object of some type.
// Then, create a class Producer that has a method produce which takes an instance of Generator and a number,
// and uses the Generator to produce a list of objects. (Not gonna specify what you can do you this one, be creative)
public class Main {
    public static void main(String[] args) {
        Generator generate = () -> "coisa";
        Producer producer = new Producer();

        List<String> listUpdate = producer.produce(generate,2);

        System.out.println(listUpdate);


        }
    }

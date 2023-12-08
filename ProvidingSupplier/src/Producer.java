import java.util.ArrayList;
import java.util.List;

public class Producer {

    public List<String> produce(Generator<String> generator, int number){
        List<String> stringList = new ArrayList<>();
        for (int i=0; i<number;i++){
            stringList.add(generator.generate());

        }
        return stringList;
    }
}

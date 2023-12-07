import java.util.List;

public class Transformer {

    public void applyTransformation(List<String> strings, Transformation transformation){
        for (String string : strings) {
            int number = transformation.transform(string);
            System.out.println(number);
        }
    }
}

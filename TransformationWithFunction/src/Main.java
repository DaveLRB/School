/*
Transformation with Function

Create a functional interface named Transformation that defines an abstract method transform which takes a String and
returns the length of that string. Then, create a class Transformer that has a method applyTransformation which takes a
list of strings and an instance of Transformation to transform the objects
according to the logic defined by the Transformation.

*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transformer transformer = new Transformer();
        List<String> stringList = new ArrayList<>();

        Transformation transformationLength = string -> string.length();
        Transformation countVowels = string -> {
            int count = 0;
            for (char c : string.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    count++;
                }
            }
            return count;

        };


        stringList.add("ave");
        stringList.add("maria");
        stringList.add("cheia");
        stringList.add("de");
        stringList.add("graça");
        stringList.add("sANTIFICADO SEJA");

        transformer.applyTransformation(stringList,transformationLength);

        transformer.applyTransformation(stringList,countVowels);

    }
}
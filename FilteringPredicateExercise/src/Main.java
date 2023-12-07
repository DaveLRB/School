/*Create a functional interface named Filter
that defines an abstract method accept which
takes an object of some type and returns a boolean value.
Then, create a class Filterer that has a method filter which takes a list of objects and an instance of Filter to filter
 the objects based on the criteria defined by the Filter.
 (The criteria can be anything, so for starters you could receive a String and filter by the
 length of each string, only accepting strings with length < 5.)*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> namelist = new ArrayList<>();
        List<String> idList = new ArrayList<>();
        namelist.add("AAASSHDSUAHGIASFGIU");
        namelist.add("jsiahkadk");
        namelist.add("aa");
        idList.add("12345");
        idList.add("123");
        idList.add("54321");
        Filterer filterer =  new Filterer();

        Filter stringLength = (string) -> string.length()<5;
        Filter wordsContainA = (string) -> string.toUpperCase().contains("A");
        Filter startsWithJ = (string) -> string.toLowerCase().startsWith("j");
        Filter checkID = (string) -> string.equals("54321");

        System.out.println(filterer.filtered(namelist,stringLength));
        System.out.println(filterer.filtered(namelist,wordsContainA));
        System.out.println(filterer.filtered(namelist,startsWithJ));
        System.out.println(filterer.filtered(idList,checkID));



        }
    }

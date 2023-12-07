import java.util.ArrayList;
import java.util.List;

public class Filterer {

    public List<String> filtered (List<String> inicialList, Filter filter){
        List <String> filteredList = new ArrayList<>();
        for(String string : inicialList){
            if(filter.accept(string)){
                filteredList.add(string);

            }
        }return filteredList;
    }
}


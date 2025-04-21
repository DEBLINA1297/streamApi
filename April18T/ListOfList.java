package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Flat map a list of lists into a single list.
public class ListOfList {
    public static void main(String[] args) {
        List<List<String>> l= Arrays.asList(Arrays.asList("Anku","Ankhi")
                ,Arrays.asList("Deblina","Rimi"));
       List<String> result= l.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(result);
    }
}

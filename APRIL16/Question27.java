package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Limit the list to the first 5 elements.
public class Question27 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8);
List<Integer> list=l.stream().limit(5).collect(Collectors.toList());
        System.out.println(list);
    }
}

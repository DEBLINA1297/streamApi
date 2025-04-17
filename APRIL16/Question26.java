package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Skip the first 3 elements and return the rest.
public class Question26 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> list=l.stream().skip(3).collect(Collectors.toList());
        System.out.println(list);
    }
}

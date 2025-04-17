package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get the first non-empty string from a list.
public class Question24 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("SS","AA","bb",null,"");
List<String> list=l.stream().filter(s -> !s.isEmpty())
        .limit(1).collect(Collectors.toList());
        System.out.println(list);
    }
}

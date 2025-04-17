package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Join all non-empty strings with a comma.
public class Question25 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList(" ","AA","bb",null,"");
List<String> list=l.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(l);
    }
}

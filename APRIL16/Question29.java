package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove all null values from a list.
public class Question29 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList(" ","AA","bb",null,"",null);
        List<String> list=l.stream().filter(s->s!=null).collect(Collectors.toList());
        System.out.println(list);

    }
}

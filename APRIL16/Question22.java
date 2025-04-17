package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Check if any string is empty in a list.
public class Question22 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList(" ","AA","bb",null,"");
        boolean list=l.stream()
                .anyMatch(s->s!=null && s.isEmpty());
        System.out.println(list);
    }
}

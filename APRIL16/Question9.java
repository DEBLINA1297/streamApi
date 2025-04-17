package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get only non-empty strings from a list.
public class Question9 {
    public static void main(String[] args) {
List<String> list= Arrays.asList("","DB",null,"","PB");
List<String> nonempty=list.stream().filter(s->s!=null&&!s.trim().isEmpty()).collect(Collectors.toList());
        System.out.println("Non empty strings: "+ nonempty);
    }
}

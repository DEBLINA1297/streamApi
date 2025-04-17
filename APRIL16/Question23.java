package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Check if all strings in the list are non-empty.
public class Question23 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList(" ","AA","bb",null,"");
        boolean res=l.stream().allMatch(s->s!=null&&!s.isEmpty() );
        System.out.println(res);
    }
}

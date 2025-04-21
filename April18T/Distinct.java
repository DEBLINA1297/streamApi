package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get distinct characters from a list of strings.
public class Distinct {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("AJNJKN","BTRDES");
        List<Character> distinct=l.stream().flatMap(s->s.chars()
                .mapToObj(c->(char)c)).distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
}

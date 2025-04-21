package April18T;

import java.util.Map;
import java.util.stream.Collectors;

//Count the number of occurrences of each character in a string.
public class NumberOfOccurrences {
    public static void main(String[] args) {
        String name="Deblinaa";
        Map<Character,Long> m= name.chars().mapToObj(n->(char)n)
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(m);
    }
}

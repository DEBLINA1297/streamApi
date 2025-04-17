package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to a list of their lengths.
public class Question28 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("AAA","FGHFH","Deblina");
        List<Integer> list=l.stream()
                .map(s->s.length()).collect(Collectors.toList());
        System.out.println(list);
    }
}

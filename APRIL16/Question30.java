package APRIL16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Generate numbers from 1 to 10 and collect them into a list.
public class Question30 {
    public static void main(String[] args) {
        List<Integer> l= IntStream.range(1,11).boxed().collect(Collectors.toList());
        System.out.println(l);
    }
}

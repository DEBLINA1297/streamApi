package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 2,2,3,3,4,5,6, 6, 7, 8);
List<Integer> res= n.stream().distinct().collect(Collectors.toList());
        System.out.println("Without duplicates: " + res);
    }
}

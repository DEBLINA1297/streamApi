package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter squared numbers that are greater than 100.
public class Question7 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14);
List<Integer> res= n.stream().map(num ->num*num)
        .filter(square-> square>100)
        .collect(Collectors.toList());
        System.out.println("Square numbers greater than 100: "+res);
    }
}

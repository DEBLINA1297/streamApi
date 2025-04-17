package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the square of each number in a list.
public class Question6 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
List<Integer> square= n.stream().map(num-> num*num).collect(Collectors.toList());
        System.out.println("Square of each number: "+ square);
    }
}

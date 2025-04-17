package APRIL16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find all odd numbers from a list of integers.
public class Question2 {
    public static void main(String[] args) {

        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> odd = n.stream()
                .filter(num -> num % 2 == 1)
                .collect(Collectors.toList());

        System.out.println("Odd numbers: " + odd);
    }
}

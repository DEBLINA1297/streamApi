package APRIL16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find all even numbers from a list of integers.
public class Question1 {
    public static void main(String[] args) {

        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> even = n.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());



        System.out.println("Even numbers: " + even);
    }
}
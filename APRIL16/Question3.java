package APRIL16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter numbers greater than 50 from a list.
public class Question3 {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(44,46,48,50,52,54,56,58);

        List<Integer> res = n.stream()
                .filter(num -> num > 50)
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 50: " + res);
    }

}

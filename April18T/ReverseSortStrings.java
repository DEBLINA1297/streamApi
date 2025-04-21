package April18T;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Reverse sort strings by their last character.
public class ReverseSortStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Deblina", "Rakesh", "Ankita", "Python");

        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed())
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}

package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the intersection of two lists using streams.
public class Intersection {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Math", "Physics", "Chemistry", "Biology");
        List<String> l2 = Arrays.asList("Chemistry", "Biology", "Bengali", "English");

        List<String> res = l1.stream()
                .filter(l2::contains)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}

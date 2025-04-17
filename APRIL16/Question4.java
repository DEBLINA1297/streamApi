package APRIL16;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to uppercase.
public class Question4 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Ankita","Deblina","Rakesh");
        List<String> uppercase = l.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: "+ uppercase);

    }
}

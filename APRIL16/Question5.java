package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to lowercase.
public class Question5 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Ankita","Deblina","Rakesh");
        List<String> lowercase = l.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Lowercase: "+ lowercase);
    }
}

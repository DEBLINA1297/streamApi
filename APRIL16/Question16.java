package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find strings that end with .com.
public class Question16 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "www.youtube.com", "abc.org",
                "hiii.com", "www.facebook.com"
        );

        List<String> result = list.stream()
                .filter(s -> s.endsWith(".com"))
                .collect(Collectors.toList());

        System.out.println("Strings ending with .com: " + result);
    }
}
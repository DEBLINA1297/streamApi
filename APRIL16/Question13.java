package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get all valid email-like strings from a list.
public class Question13 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("anku123@gmail.com",
                                     "abc","deblina123@gmail.com", "deblinasign.com");
        List<String> list=l.stream().filter(s->s.endsWith("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println("Valid email like: "+ list);
    }
}

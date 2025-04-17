package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get strings that do not contain any digits.
public class Question20 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("AAbb","123aaa","AGRFS");
       List<String> list=l.stream()
               .filter(s->!s.chars().anyMatch(Character::isDigit))
               .collect(Collectors.toList());
        System.out.println(list);
    }
}

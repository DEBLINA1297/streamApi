package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get strings that contain only alphabets.
public class Question18 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("123aa","AAAA","FTHDRF1","$AFDA");
        List<String> list=l.stream()
                .filter(s-> s.chars().allMatch(Character::isAlphabetic))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

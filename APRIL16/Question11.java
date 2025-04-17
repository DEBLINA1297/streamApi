package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get all strings that contain only digits.
public class Question11 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("12","Pb","Db","26","1");
        List<String> list=l.stream().filter(s -> !s.isEmpty()&& s.chars()
                .allMatch(Character::isDigit)).collect(Collectors.toList());
        System.out.println("Strings with only digits: "+ list);
    }
}

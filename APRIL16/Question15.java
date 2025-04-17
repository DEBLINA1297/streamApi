package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get strings that resemble dates in dd-mm-yyyy format.
public class Question15 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("yx-12-1998","1-2-2","123","12-12-1998");
       l.stream()
                .filter(x->x.length()==10 && x.charAt(2)=='-' && x.charAt(5)=='-'
                        && x.substring(0,2).chars().allMatch((Character::isDigit))
                        && x.substring(3,5).chars().allMatch((Character::isDigit))
                        && x.substring(6,10).chars().allMatch((Character::isDigit)))
                .forEach(System.out::println);

    }
}

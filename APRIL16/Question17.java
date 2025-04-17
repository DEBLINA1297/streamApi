package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter strings that contain special characters.
public class Question17 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("AA#BB", "AABB", "aabb", "$#mm");
List<String> list=l.stream().filter(s->s.chars()
        .allMatch(Character::isLetterOrDigit)).collect(Collectors.toList());
        System.out.println(list);
    }
}
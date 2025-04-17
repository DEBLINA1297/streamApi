package APRIL16;

import java.util.Arrays;
import java.util.List;

//Count how many strings are empty in a list.
public class Question10 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("","DB",null,"","PB");
        long count = list.stream().filter(s -> s==null || s.trim().isEmpty()).count();
        System.out.println(count);
    }
}

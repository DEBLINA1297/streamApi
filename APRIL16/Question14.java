package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter strings that look like mobile numbers (10 digits).
public class Question14 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("1234567","8513974567","7574673");
        List<String> list=l.stream().filter(s->String.valueOf(s).length()==10).collect(Collectors.toList());
        System.out.println("Look like mobile number: "+ list);
    }
}

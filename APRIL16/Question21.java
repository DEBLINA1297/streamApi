package APRIL16;
//Count how many strings have more than 5 characters.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question21 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("21retd","ADAFDA2","GFG1");
        List<String> list=l.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(list);
    }
}

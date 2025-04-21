package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Implement custom collector to concatenate uppercase names with ;.
public class CustomCollector {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Deblina","Ankita","Shreyasi","khusi");
        String res=l.stream().map(String::toUpperCase).collect(Collectors.joining(";"));
        System.out.println(res);
    }
}

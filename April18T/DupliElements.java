package April18T;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find duplicate elements in a list using Stream API.
public class DupliElements {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Deblina","Deblina","Ankita","Ankita","Shreyasi","Khusi");
        Set<String> s= new HashSet<>();
        List<String> dupli=l.stream()
                .filter(n->!s.add(n)).distinct().collect(Collectors.toList());
        System.out.println(dupli);
    }
}

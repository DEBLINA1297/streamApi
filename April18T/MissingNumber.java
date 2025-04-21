package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Find missing numbers in a range using Stream API.
public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 12, 14, 16, 17, 20);
int i1=11;
int i2=20;
List<Integer> l= IntStream.range(i1,i2)
        .filter(n->!numbers.contains(n)).boxed().collect(Collectors.toList());
        System.out.println(l);
    }
}

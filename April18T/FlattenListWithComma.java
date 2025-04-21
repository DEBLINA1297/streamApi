package April18T;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//Flatten a list of comma-separated strings into a unique list of strings.
public class FlattenListWithComma {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("12,22","32,40","5","12,22");
        HashSet<String> set=new HashSet<>(lists);
        String result = lists.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}

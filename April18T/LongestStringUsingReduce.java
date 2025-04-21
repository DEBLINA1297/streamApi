package April18T;

import java.util.Arrays;
import java.util.List;

//Find the longest string in a list using reduce().
public class LongestStringUsingReduce {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("AAAA","aa1235bb","cxxccxcsx");
        String longest=l.stream().
                reduce((s1,s2)->s1.length()>=s2.length() ? s1:s2)
                .orElse(null);
        System.out.println(longest);
    }
}

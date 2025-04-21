package April18T;
//Check if a list is sorted using Stream API.

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListSortedOrNot {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,2,4,5);

        Boolean check= IntStream.range(0,list.size()-1)
                .allMatch(i -> list.get(i) <= list.get(i + 1));
        System.out.println(check);
    }
}

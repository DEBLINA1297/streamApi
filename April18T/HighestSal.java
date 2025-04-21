package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSal {
    public static void main(String[] args) {
        List<Employee> l= Arrays.asList(new Employee("Ankita",70000),
        new Employee("Deblina",50000),
                new Employee("Rakesh",100000));
        List<Employee> list=l.stream()
                .sorted((e1,e2)->Integer.compare(e2.sal, e1.sal))
                .limit(3).collect(Collectors.toList());
        System.out.println(list);

    }
}

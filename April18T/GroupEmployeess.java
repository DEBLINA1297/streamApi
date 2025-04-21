package April18T;
//Group employees by department and calculate average salary.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    public String name;
    public String dept;
    public  int salary;

    public Emp(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() { return dept; }
    public int getSalary(){ return salary; }
    @Override
    public String toString() {
        return "Emp{name='" + name + "', dept='" + dept + "', salary=" + salary + "}";
    }
}

public class GroupEmployeess {
    public static void main(String[] args) {
        List<Emp> emp= Arrays.asList(new Emp("Ankita","Java",10000),
                new Emp("Deblina","Java",10000),
                new Emp("Rakesh","Java",10000));
        Map<String, Double> list = emp.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDept,
                        Collectors.averagingInt(Emp::getSalary)
                ));
        System.out.println(list);

}
}

package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Given a list of people, find the oldest person whose name starts with “J”.
class Person
{
    public int age;
    public String name;
    public Person(String name, int age)
    {
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class NameStartsWith {
    public static void main(String[] args) {
        List<Person> l= Arrays.asList( new Person("John",33),
                new Person("Jack",12),
                new Person("Anku",24),
                new Person("Deblina",26));
        Optional<Person> oldPerson= l.stream()
                .filter(s->s.getName().startsWith("J"))
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);

        System.out.println(oldPerson.get());
    }
}

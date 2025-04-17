package APRIL16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get all strings that start with a capital letter.
public class Question12 {
    public static  void main(String[] args) {
        List<String> l= Arrays.asList("Debli","anku","Tom");
          List<String> caps=l.stream()
                  .filter(word->!word.isEmpty()&& Character.isUpperCase(word.charAt(0)))
                  .collect(Collectors.toList());
        System.out.println("Strings start with a capital letter: "+ caps);

    }
}

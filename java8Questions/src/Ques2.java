import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques2 {
    // How do you remove duplicate elements from a list using Java 8 streams?
    public static List<String> removeDuplicates(List<String> list){
        List<String> unique = list.stream().distinct().collect(Collectors.toList());
        return unique;
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println(removeDuplicates(list));
    }
}

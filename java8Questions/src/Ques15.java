import java.util.*;
import java.util.stream.Collectors;

public class Ques15 {
    // Given a list of strings, sort them according to increasing order of their length?
    public static List<String> sort(List<String> list){
        List<String> result = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        return result;
    }
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println(sort(listOfStrings));
    }
}

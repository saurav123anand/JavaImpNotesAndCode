import java.util.*;
import java.util.stream.Collectors;

public class Ques18 {
    // Given a list of strings, find out those strings which start with a number?
    public static List<String> startsWith(List<String> list){
        List<String> result = list.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());
        return result;
    }
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "6ix","45ro,'7ko");
        System.out.println(startsWith(listOfStrings));

    }
}

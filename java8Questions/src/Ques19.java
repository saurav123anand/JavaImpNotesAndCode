import java.util.*;
import java.util.stream.Collectors;

public class Ques19 {
    //How do you extract duplicate elements from an array?
    public static List<Integer> extract(List<Integer> list){
        Set<Integer> set=new HashSet<>();
        List<Integer> result = list.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
        return result;
    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        System.out.println(extract(listOfIntegers));
    }
}

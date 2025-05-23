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
        List<Integer> listOfIntegers = Arrays.asList(122,122,345,4,54,54,54,2,212,1,31,21131,3,11,3);
        System.out.println(extract(listOfIntegers));
    }
}

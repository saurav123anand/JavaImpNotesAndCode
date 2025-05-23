import java.util.*;
import java.util.stream.Collectors;

public class Ques1 {
    // Given a list of integers, separate odd and even numbers?

    public static void filterNumbers(List<Integer> list){
        Map<Boolean, List<Integer>> oddEvenMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = oddEvenMap.entrySet();
        for (Map.Entry<Boolean,List<Integer>> entry:entries){
            if(entry.getKey()){
                System.out.println("even numbers : ");
            }
            else {
                System.out.println("odd numbers : ");
            }
            List<Integer> values = entry.getValue();
            System.out.println(values);
        }

    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(23,78,95,73,23,56,12,90,334,71,95,73,23,561,12,90,33);
        filterNumbers(listOfIntegers);
    }
}

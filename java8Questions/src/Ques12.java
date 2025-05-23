import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ques12 {
    // Find second largest number in an integer array?
    public static int secondLargest(List<Integer> list){
        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        return first.get();

    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(32,3,2323,23,23,23,234,24,234,324,232,3121,21,3213,123);
        System.out.println(secondLargest(listOfIntegers));
    }
}

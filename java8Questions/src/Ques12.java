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
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(secondLargest(listOfIntegers));
    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ques8 {
    // Given a list of integers, find maximum and minimum of those numbers?
    public static void minMax(List<Integer> list){
        Optional<Integer> minVal = list.stream().min(Comparator.naturalOrder());
        Optional<Integer> maxVal = list.stream().max(Comparator.naturalOrder());
        System.out.println(minVal.get());
        System.out.println(maxVal.get());
    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        minMax(listOfIntegers);
    }
}

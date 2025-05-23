import java.util.Arrays;
import java.util.List;

public class Q29 {
    // Find all the numbers which are multiple of 5 and divisible by 3 from the given list of integers?
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(445,23,555,4,5,6,7,7788,265,875);
        List<Integer> ans = listOfIntegers.stream().filter(i -> (i % 5 == 0 && i % 3 == 0)).toList();
        System.out.println(ans);
    }
}

import java.util.Arrays;
import java.util.List;

public class Q27 {
    // Flatten a List of Lists
    public static void main(String[] args) {
        List<List<Integer>> list= Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        List<Integer> flatten = list.stream().flatMap(li -> li.stream()).toList();
        System.out.println(flatten);
    }
}

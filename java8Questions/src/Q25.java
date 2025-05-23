import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q25 {
    // How to Reverse elements of a Parallel Stream in Java?
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,1,12,13,14,15,16,17,18,19,20);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        List<Integer> maintainedList = list.parallelStream().collect(Collectors.toList());
        Collections.reverse(maintainedList);
    }
}

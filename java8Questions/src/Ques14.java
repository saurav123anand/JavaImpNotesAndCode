import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques14 {
    // Find sum of all digits of a number in Java 8?
    public static int sum(int n){
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
    public static void main(String[] args) {
        int i = 6786567;
        System.out.println(sum(i));
    }
}

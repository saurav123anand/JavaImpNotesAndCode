import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques14 {
    // Find sum of all digits of a number in Java 8?
    public static int sum(int n){
        return Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(Integer::parseInt));
    }
    public static void main(String[] args) {
        int i = 15623;
        System.out.println(sum(i));
    }
}

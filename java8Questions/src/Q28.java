import java.util.stream.IntStream;

public class Q28 {
    public static void main(String[] args) {
        int number = 12;
        long factorial = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);

        System.out.println(factorial);
    }
}

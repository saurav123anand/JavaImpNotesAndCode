import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
//        OptionalDouble average = stream.average();
//        Stream<Integer> boxed = stream.boxed();
        IntStream range = IntStream.range(1, 5);
    }
}

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    // Stream processes the data in a declarative and functional way

    public static void main(String[] args) {
        // how to create infinite stream
//        Stream<Integer> stream = Stream.generate(() -> 1).limit(40);
//        Integer sum = stream.reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//
//        // second way
//        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(10).toList();
//        System.out.println(list);


        // anyMatch
//        List<Integer> list=List.of(1,2,34);
//        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0);
//        System.out.println(anyMatch);
//
//        // allMatch
//        boolean allMatch = list.stream().allMatch(x -> x % 2 == 0);
//        System.out.println(allMatch);

        // counting occurrences of a character
        String sentence="Hello world";
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);
    }

}

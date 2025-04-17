import java.util.Arrays;
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
//        String sentence="Hello world";
//        long count = sentence.chars().filter(x -> x == 'l').count();
//        System.out.println(count);

        // peek--> performs an action on each element as it's consumed.
//        Stream.iterate(1,x->x+1).limit(100).peek(System.out::println).count();

        // flatMap--> Handle streams of collections, lists or arrays where each
//        element is itself a collection
        // flatten nested structures(e.g: lists within lists) so that they can be
//        processed as a single sequence of elements
        // Transform and flatten elements at the same time.

//        List<List<String>> listOfLists= Arrays.asList(
//                Arrays.asList("Apple","banana"),
//                Arrays.asList("Orange","Kiwi"),
//                Arrays.asList("pera","grape")
//        );
//        List<String> list = listOfLists.stream().flatMap(x -> x.stream())
//                .map(x -> x.toUpperCase()).toList();
//        System.out.println(list);

        List<String> sentences=Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatmap is useful"
        );
        List<String> list = sentences.stream().flatMap(sentence ->
                        Arrays.stream(sentence.split(" "))).map(x -> x.toUpperCase())
                .toList();
        System.out.println(list);

    }

}

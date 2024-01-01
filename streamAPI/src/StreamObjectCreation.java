import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// here we will learn how to create stream object  (since stream is an interface so by implementation we can create)
public class StreamObjectCreation {
    public static void main(String[] args) {
        // first way
//        Stream<Object> empty = Stream.empty();
//        System.out.println(empty);

        // second way
//        String names[]={"Saurav","Anand","Rohan"};
//        Stream<String> stream = Stream.of(names);
//        stream.forEach(e-> System.out.println(e));

        // 3rd way
//        Stream<Object> build = Stream.builder().build();

        // 4th
//        IntStream stream = Arrays.stream(new int[]{5, 3, 7});
//        stream.forEach(el-> System.out.println(el));

        // 5th way
        // list ,set
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(52);
        list.add(512);
        Stream<Integer> stream = list.stream();
        stream.forEach(el-> System.out.println(el));


    }

}

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,2,3,4,5);

        // collecting to a specific collection
//        ArrayDeque<Integer> collect = nums.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
//        System.out.println(collect);

        // joining strings
//        String collect1 = nums.stream().map(s -> s.toString().toUpperCase()).
//                collect(Collectors.joining());
//        System.out.println(collect1);

        // calculating averages
//        Double collect = nums.stream().collect(Collectors.averagingInt(x -> x));
//        System.out.println(collect);

        // grouping by
        List<String> words=Arrays.asList("hello","world","java","list","is","collecting");
//        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(x -> x.length()));
//        System.out.println(collect);

//        Map<Integer, String> collect = words.stream().collect(Collectors.groupingBy(String::length,
//                Collectors.joining(",")));
//        System.out.println(collect);

//        Map<Integer, Long> collect = words.stream().collect(Collectors.groupingBy(String::length,
//                TreeMap::new,Collectors.counting()));
//        System.out.println(collect);

        // creating a map from stream elements
        List<String> fruits=Arrays.asList("grapes","mango","banana","kiwi","pomegranate");
        Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(),
                x -> x.length()));
        System.out.println(collect);
    }
}

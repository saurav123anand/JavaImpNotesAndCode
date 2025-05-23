import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q24 {
    //  How to find only duplicate elements with its count from the String ArrayList in Java8?
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Rohan", "Rahul", "Keshav", "Rohan");
        System.out.println(findDuplicatesCount(names));
    }
    public static Map<String,Long> findDuplicatesCount(List<String> names) {
        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        return collect;
    }
}

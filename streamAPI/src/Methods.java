import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        List<String> names=List.of("Aman","Saurav","Rahul","Anand");
        // filter all the elements starts with A
//        List<String> filtered = names.stream().filter(val -> val.startsWith("A")).collect(Collectors.toList());
//        System.out.println(filtered);

        // Map method
        List<Integer> numbers=List.of(1,2,7,3);
        // squares all the element and return
//        List<Integer> collect = numbers.stream().map(val -> val * val).collect(Collectors.toList());
//        System.out.println(collect);

        // sorted method
//        numbers.stream().sorted().forEach(System.out::println);

        // min,max
        Optional<Integer> min = numbers.stream().min((x, y) -> x.compareTo(y));
        System.out.println(min.get());

        Optional<Integer> max = numbers.stream().max((x, y) -> x.compareTo(y));
        System.out.println(max.get());

    }
}

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques22 {
   // Find first non-repeated character in a string?
    public static String nonRepeated(String str){
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).findFirst().get();

    }
    public static void main(String[] args) {
        String str = "java is a just a awesome programming language and it's platform independent";
        System.out.println(nonRepeated(str));
    }
}

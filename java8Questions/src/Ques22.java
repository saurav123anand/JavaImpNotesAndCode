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
        String result = map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).findFirst().get();
        return result;
    }
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(nonRepeated(inputString));
    }
}

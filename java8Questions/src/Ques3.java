import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques3 {
    // How do you find frequency of each character in a string using Java 8 streams?
    public static Map<Character,Long> getFreq(String str){
        Stream<Character> characterStream = str.chars().mapToObj(i -> (char) i);
        Map<Character, Long> result = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return result;

    }
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        System.out.println(getFreq(inputString));

    }
}

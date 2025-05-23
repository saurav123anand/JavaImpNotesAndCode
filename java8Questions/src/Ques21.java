import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques21 {
    //Find first repeated character in a string?
//    public static List<String> extract(String str){
//        Set<String> set=new HashSet<>();
//        List<String> result = Arrays.stream(str.split("")).filter(num -> !set.add(num)).collect(Collectors.toList());
//        return result;
//    }

    //second way
    public static String extract(String str){
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
        String result = map.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).findFirst().get();
        return result;
    }
    public static void main(String[] args) {
        String inputString = "java is a awesome programming language";
//        System.out.println(extract(inputString).get(0));
        System.out.println(extract(inputString));
    }
}

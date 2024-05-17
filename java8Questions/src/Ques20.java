import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ques20 {
    //Print duplicate characters in a string?
    public static Set<String> extract(String str){
        Set<String> set=new HashSet<>();
        Set<String> result = Arrays.stream(str.split("")).filter(num -> !set.add(num)).collect(Collectors.toSet());
        return result;
    }
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(extract(inputString));
    }
}

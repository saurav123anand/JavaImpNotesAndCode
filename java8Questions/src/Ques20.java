import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ques20 {
    //Print duplicate characters in a string?
    public static Set<String> duplicates(String str){
        Set<String> set=new HashSet<>();
        Set<String> result = Arrays.stream(str.split("")).filter(num -> !set.add(num)).collect(Collectors.toSet());
        return result;
    }
    public static void main(String[] args) {
        String inputString = "java is a awesome programming language";
        System.out.println(duplicates(inputString));
    }
}

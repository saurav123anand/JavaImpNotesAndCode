import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques17 {
    // Reverse each word of a string using Java 8 streams?
    public static String reverse(String str){
        String reversed = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        return reversed;
    }
    public static void main(String[] args) {
        String str = "java is a awesome programming language";
        System.out.println(reverse(str));
    }
}

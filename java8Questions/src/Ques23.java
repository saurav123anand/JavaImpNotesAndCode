import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques23 {
   // How do you get last element of an array?
    public static String lastElement(List<String> list){
        String result = list.stream().skip(list.size() - 1).findFirst().get();
        return result;
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        System.out.println(lastElement(list));
    }
}

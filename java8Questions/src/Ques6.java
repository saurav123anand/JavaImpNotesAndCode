import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {
    // Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
    public static String join(List<String> list){
        String result = list.stream().collect(Collectors.joining(",", "[", "]"));
        return result;
    }
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(join(listOfStrings));
    }
}

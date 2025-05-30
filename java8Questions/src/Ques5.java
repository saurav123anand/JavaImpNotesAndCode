import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques5 {
   // How do you sort the given list of decimals in reverse order?
    public static List<Double> sortReverse(List<Double> list){
        List<Double> ans = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return ans;
    }
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45,9.81,45.9,12.7,89.90,34.56,11.3);
        System.out.println(sortReverse(decimalList));
    }
}

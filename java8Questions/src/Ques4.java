import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques4 {
    // How do you find frequency of each element in an array or a list?

    public static Map<String, Long> getFreq(List<String> list){
        Map<String, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return result;
    }

    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        System.out.println(getFreq(stationeryList));
    }
}

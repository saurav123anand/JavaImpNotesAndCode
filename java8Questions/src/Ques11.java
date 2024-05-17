import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ques11 {
    // How do you get three maximum numbers and three minimum numbers from the given list of integers?
    public static void getThreeMinMax(List<Integer> list){
        System.out.println("first 3 max numbers");
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        System.out.println("first 3 min numbers");
        list.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);

    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        getThreeMinMax(listOfIntegers);
    }
}

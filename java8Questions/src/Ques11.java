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
        List<Integer> listOfIntegers = Arrays.asList(23,231,23,122,34,2,44,3435,1232,434,234,2,24234,232,2423423);
        getThreeMinMax(listOfIntegers);
    }
}

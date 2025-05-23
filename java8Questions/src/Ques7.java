import java.util.Arrays;
import java.util.List;

public class Ques7 {
    // From the given list of integers, print the numbers which are multiples of 5?
    public static void printMultiple(List<Integer> list){
        list.stream().filter(i->i%5==0).forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45,2343,32,25,45,12,15);
        printMultiple(listOfIntegers);

    }
}

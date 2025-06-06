import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques9 {
    // How do you merge two unsorted arrays into single sorted array using Java 8 streams?
    public static int[] merge(int[] arr1,int[] arr2){
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        return merged;

    }
    public static void main(String[] args) {
        int[] a = new int[] {4,3,32,2};
        int[] b = new int[] {4,22,3,21};
        int[] merge = merge(a, b);
        Arrays.stream(merge).forEach(System.out::println);
    }
}

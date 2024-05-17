import java.util.Arrays;
import java.util.stream.IntStream;

public class Ques10 {
    // How do you merge two unsorted arrays into single sorted array without duplicates?
    public static int[] merge(int[] arr1,int[] arr2){
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
        return merged;

    }
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};
        int[] merge = merge(a, b);
        Arrays.stream(merge).forEach(System.out::println);
    }
}

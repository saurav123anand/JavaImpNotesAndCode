import java.util.Arrays;
import java.util.stream.IntStream;

public class Ques10 {
    // How do you merge two unsorted arrays into single sorted array without duplicates?
    public static int[] merge(int[] arr1,int[] arr2){
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
        return merged;

    }
    public static void main(String[] args) {
        int[] a = new int[] {6,0,4,5};
        int[] b = new int[] {1,0,9,3};
        System.out.println(Arrays.toString(merge(a,b)));
    }
}

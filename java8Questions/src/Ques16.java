import java.util.Arrays;
import java.util.OptionalDouble;

public class Ques16 {
    // Given an integer array, find sum and average of all elements?
    public static void sumAvg(int [] arr){
        int sum = Arrays.stream(arr).sum();
        OptionalDouble average = Arrays.stream(arr).average();
        double asDouble = average.getAsDouble();
        System.out.println("sum is "+sum+" and average is "+asDouble);
    }
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        sumAvg(a);
    }
}

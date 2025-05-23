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
        int[] a = new int[] {12,32,3,23,34,123,23,4324,3,4,3,4,3,5443,534,5,34,52,4,34,234,325,353};
        sumAvg(a);
    }
}

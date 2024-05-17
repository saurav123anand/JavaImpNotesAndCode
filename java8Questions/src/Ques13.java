import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques13 {
    // Java 8 program to check if two strings are anagrams or not?
    public static boolean isAnagram(String s1,String s2){
        s1 = Stream.of(s1.split("")).map(val -> val.toLowerCase()).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(val -> val.toLowerCase()).sorted().collect(Collectors.joining());
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        System.out.println(isAnagram(s1,s2));
    }
}

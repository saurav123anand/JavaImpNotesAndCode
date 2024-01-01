import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      // Create a List and filter all the even numbers
        List<Integer> list=List.of(1,2,3,4,6);  // List.of is immutable
        // list.add(45); // we can't do this
        System.out.println(list);

        // without stream
//        List<Integer> evenList=new ArrayList<>();
//        for (Integer i:list){
//            if (i%2==0)
//                evenList.add(i);
//        }
//        System.out.println(evenList);

        // with stream
        Stream<Integer> stream = list.stream();
        List<Integer> collect = stream.filter(val -> val % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ques {

    public static void main(String[] args) {
        // 1. sequential vs parallel stream performance
        // sequential stream
//        List<Integer> list = IntStream.rangeClosed(1, 10000000).boxed().toList();
//        long startTime = System.currentTimeMillis();
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//        long endTime=System.currentTimeMillis();
//        System.out.println("sequential sum time is "+ (endTime-startTime)+" ms");
//
        // parallel stream
//        long parallelStartTime = System.currentTimeMillis();
//        int sum1 = list.parallelStream().mapToInt(Integer::intValue).sum();
//        long parallelEndTime=System.currentTimeMillis();
//        System.out.println("parallel sum time is "+ (parallelEndTime-parallelStartTime)+" ms");

        // 2. using map() and filter() in parallel streams
//        List<String> names= Arrays.asList("Alice","Bob","Charlie","david","Edward");
//        // sequential stream
//        List<String> seqResult = names.stream().filter(name -> name.length() > 3)
//                .map(String::toUpperCase).toList();
//        System.out.println("sequential result "+seqResult);
//
//        // parallel stream (here parallel stream speeds up large operation)
//        List<String> parResult = names.parallelStream().filter(name -> name.length() > 3)
//                .map(String::toUpperCase).toList();
//        System.out.println("parallel result "+parResult);

        // using reduce
//        List<Integer> list=Arrays.asList(1,2,3,4,5);
//        Integer seqReduce = list.stream().reduce(0, (a, b) -> a + b);
//        System.out.println("sequential result "+seqReduce);
//
//        Integer paraReduce = list.parallelStream().reduce(0, (a, b) -> a + b);
//        System.out.println("parallel result "+paraReduce);

        // 1. Convert a list of string into uppercase
        List<String> list=List.of("Java","parallel","streams");
        List<String> ans = list.parallelStream().map(String::toUpperCase).toList();
        System.out.println(ans);
        IntStream.rangeClosed(1,1000).parallel();

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // this can significantly improve performance for large data sets
        // workload is distributed across multiple threads

//        long startTime=System.currentTimeMillis();
//        List<Integer> list=Stream.iterate(1,x->x+1).
//                limit(2600).toList();
//        List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
//        System.out.println(factorialList);
//        long endTime=System.currentTimeMillis();
//        System.out.println("Time taken with sequential stream: "+(endTime-startTime)+"ms");
//
//        startTime=System.currentTimeMillis();
//        list=Stream.iterate(1,x->x+1).
//                limit(2600).toList();
//        factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
//        factorialList = list.parallelStream().map(ParallelStream::factorial).sequential().toList();
//        System.out.println(factorialList);
//        endTime=System.currentTimeMillis();
//        System.out.println("Time taken with parallel stream: "+(endTime-startTime)+"ms");

     // parallel streams are most effective for CPU-intensive or large datasets
        // where tasks are independent
        // they may add overhead for simple tasks or small datasets beacuse of
        // multiple threads


        // for cumulative sum parallel stream won't work as expected because orders
//        are not maintained
        // let's see it in action

        // [1,2,3,4,5] --> want output as [1,3,6,10,15]
        // using parallel stream it won't give correct output because one task is
        // dependent on other

//        List<Integer> list= Arrays.asList(1,2,3,4,5);
//        AtomicInteger sum=new AtomicInteger(0);
//        List<Integer> cumulativeSum = list.parallelStream().map(sum::addAndGet)
//                .toList();
//        System.out.println("Expected cumulative sum: [1,3,6,10,15]");
//        System.out.println("Actual result with parallel stream: "+cumulativeSum);



        List<String> names=List.of("Saurav","Gaurav","Anand");
        names.parallelStream().forEachOrdered(System.out::println);


    }
    public static long factorial(long n){
        if(n<=1) return n;
        return n*factorial(n-1);
    }
}

import javax.xml.stream.events.StartDocument;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
        // 1. Given a list of integers,
        // find out all the numbers starting with 1 using Stream functions?
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        List<Integer> filteredList=myList.stream().filter(num->String.valueOf(num).startsWith("1")).toList();
//        System.out.println(filteredList);

        // 2. How to find duplicate elements
        // in a given integers list in java using Stream functions?

//        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15,98);
//        Set<Integer> set=new HashSet<>();
//        Set<Integer> duplicates = list.stream().filter(num -> !set.add(num)).collect(Collectors.toSet());
//        System.out.println(duplicates);

        // 3. Given the list of integers, find the first element of the
        // list using Stream functions?
//
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Integer i = myList.stream().limit(1).findFirst().get();
//        System.out.println(i);

        // 4. Given a list of integers, find the total number of elements present
        // in the list using Stream functions
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        System.out.println(myList.stream().count());

        // 5. Given a list of integers, find the maximum value element present
        // in it using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Integer max = myList.stream().sorted(Collections.reverseOrder()).limit(1).findFirst().get();
//        System.out.println(max);
//
//        Optional<Integer> max = myList.stream().max(Comparator.naturalOrder());
//        System.out.println(max.get());

        // 6. Given a String, find the first non-repeated character
        // in it using Stream functions?
//        String input = "java articles are Awesome";
//            Character firstNonRepeating = input.chars().mapToObj(ch->Character.toLowerCase((char) ch)).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() == 1)
//                .map(entry -> entry.getKey())
//                .findFirst().orElse(null);
//        System.out.println(firstNonRepeating);

        // second way
//        Character firsNonRep = input.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
//                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
//                .findFirst().orElse(null);
//        System.out.println(firsNonRep);

        // 7. Given a String, find the first repeated character in it using Stream functions?
//        String input = "Java Articles are Awesome";
//        Character firstRep = input.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream().filter(entry -> entry.getValue() > 1)
//                .map(entry -> entry.getKey())
//                .findFirst().orElse(null);
//        System.out.println(firstRep);

//        Character firstRep = input.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
//                .filter(ch -> input.indexOf(ch) != input.lastIndexOf(ch))
//                .findFirst().orElse(null);
//        System.out.println(firstRep);

        //8. sort the string in ascending order using java 8
//        List<String> stringList=List.of("saurav","anand","abc");
//        List<String> sortedList = stringList.stream().sorted().toList();
//        System.out.println(sortedList);

        // 9. Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.
//        int[] nums={1,2,3,1};
//        List<Integer> list = Arrays.stream(nums).boxed().toList();
//        Set<Integer> set=new HashSet<>(list);
//        System.out.println(list.size()!=set.size());\
        // 10. How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        System.out.println(collect);


    }
}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Basic {
    public static void main(String[] args) {
        //predicate
//        Predicate<Integer> predicate=a->a%2==0;
//        System.out.println(predicate.test(4));

        // Function
//        Function<Integer,String> function=a->a+"saurav";
//        System.out.println(function.apply(5));

//            Function<Integer,Integer> doubleIt=a->a*2;
//            Function<Integer,Integer> tripleIt=a->a*3;
//        Integer apply = doubleIt.andThen(tripleIt).apply(3);
//        System.out.println(apply);

        // BiFunction
//        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a+b;
//        System.out.println(biFunction.apply(2,8));
//
//        Consumer<Integer> consumer=a-> System.out.println(a+7);
//        consumer.accept(3);

        // Supplier
//        Supplier<String> stringSupplier=()->"hello world";
//        System.out.println(stringSupplier.get());

        // UnaryOperator- when Function functional interface has both parameter and
//        return type are same then use UnaryOperator

//        UnaryOperator<Integer> unaryOperator=a->a+7;
//        System.out.println(unaryOperator.apply(4));
        // BinaryOperator- when BiFunction functional interface has both parameter and
//        return type are same then use BinaryOperator
//        BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
//        System.out.println(binaryOperator.apply(3,9));

        // Method reference--> use method without invoking and in place of lamda
//        expression.

//        List<String> names = Arrays.asList("Ram", "Shyam", "Ghanshyam");
//        names.forEach(System.out::println);

        // constructor reference
        List<String> names = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        List<Student> list = names.stream().map(Student::new).toList();
        System.out.println(list);


    }

}
class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}
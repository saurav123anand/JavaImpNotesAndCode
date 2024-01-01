import java.io.StringReader;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        String str="Java is my fav language";
        // creating optional object
        Optional<String> optional = Optional.ofNullable(str); // or using Optional.of(str)
//        if (optional.isPresent()){
//            System.out.println(optional.get().length());
//        }
//        else{
//            System.out.println("str is empty");
//        }

        // single line
        String val = optional.orElse("Object is empty");
        System.out.println(val);

    }
}

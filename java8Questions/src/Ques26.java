import java.util.Optional;

public class Ques26 {
    //Use Optional to Avoid NullPointerException
    public static void main(String[] args) {
        Optional<String> optional=Optional.ofNullable("saurav");
        System.out.println(optional.orElse("default value"));
    }
}

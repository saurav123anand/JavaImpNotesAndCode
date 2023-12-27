package abstractDesignPattern;

public class AndroidDev implements Employee {
    @Override
    public int salary() {
        System.out.println("getting android dev salary...");
        return 50000;
    }

    @Override
    public String name() {
        return "I'm android dev";
    }
}

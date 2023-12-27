package abstractDesignPattern;


public class WebDev implements Employee {
    @Override
    public int salary() {
        System.out.println("getting web dev salary...");
        return 40000;
    }

    @Override
    public String name() {
        return "I'm Web dev";
    }
}

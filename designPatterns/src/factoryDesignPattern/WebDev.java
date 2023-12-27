package factoryDesignPattern;

public class WebDev implements Employee{
    @Override
    public int salary() {
        System.out.println("getting web dev salary...");
        return 40000;
    }
}

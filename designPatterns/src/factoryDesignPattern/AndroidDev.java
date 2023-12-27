package factoryDesignPattern;

public class AndroidDev implements Employee{
    @Override
    public int salary() {
        System.out.println("getting android dev salary...");
        return 50000;
    }
}

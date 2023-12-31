import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("main thread is running ");
        Thread thread=new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("java 8 syntax thread");
        },"java 8");
        thread.start();
        System.out.println("main thread ended execution ");


    }
}

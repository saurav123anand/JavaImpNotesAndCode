import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main is starting");
//        Thread thread1=new Thread1();
//        thread1.start();

//        Thread thread1=new Thread1("Thread1");
//        thread1.setDaemon(true);
//        thread1.start();

//        Thread thread1=new Thread1("Thread1");
//        thread1.start();
//
//        Thread thread2=new Thread(new Thread2(),"Thread2");
//        thread2.start();
//
//        Thread thread3=new Thread(()->{
//            for (int i = 0; i <=5; i++) {
//                System.out.println("Inside "+Thread.currentThread().getName()+" "+i);
//            }
//        },"Thread3");
//        thread3.start();

        Stack stack=new Stack(5);
        new Thread(()->{
            int counter=0;
            while (++counter<10){
                System.out.println("Pushed : "+stack.push(100));
            }
        },"Pusher").start();
        new Thread(()->{
            int counter=0;
            while (++counter<10){
                System.out.println("Popped : "+stack.pop());
            }
        },"Popper").start();
        System.out.println("Main is exiting");
    }
}
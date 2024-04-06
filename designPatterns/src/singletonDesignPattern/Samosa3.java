package singletonDesignPattern;

import java.io.Serializable;

public class Samosa3 implements Serializable,Cloneable {
    private static Samosa3 samosa;
    private Samosa3(){

    }
    // Lazy way of creating singleton object  --> good approach for single threaded
//    public static Samosa getSamosa(){
//        // create object of this class
//        if (samosa==null){
//            samosa=new Samosa();
//        }
//        return samosa;
//    }

    // for multi threaded
    public static Samosa3 getSamosa(){
        // create object of this class
        if (samosa==null){
            synchronized (Samosa3.class){
                if (samosa==null){
                    samosa=new Samosa3();
                }
            }
        }
        return samosa;
    }
    // saving for deserialization
    public Object readResolve(){
       return samosa;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // saving from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}

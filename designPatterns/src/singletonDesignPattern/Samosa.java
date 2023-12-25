package singletonDesignPattern;

public class Samosa {
    private static Samosa samosa;
//    private Samosa(){
//
//    }

    // saving object from reflection api
    private Samosa(){
       if (samosa!=null){
          throw new RuntimeException("You're trying to break singleton pattern");
       }
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
    public static Samosa getSamosa(){
        // create object of this class
        if (samosa==null){
            synchronized (Samosa.class){
                if (samosa==null){
                    samosa=new Samosa();
                }
            }
        }
        return samosa;
    }
}

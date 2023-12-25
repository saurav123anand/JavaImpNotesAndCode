package singletonDesignPattern;

import java.io.*;

// When we only want to create one instance of class and want to reuse the same object
public class SingletonDesignPattern {
    public static void main(String[] args) throws Exception {
//        Samosa samosa=Samosa.getSamosa();
//        Samosa samosa2=Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        System.out.println(samosa2.hashCode());

        // breaking pattern using Reflection API
//        Samosa samosa1=Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa samosa2 = constructor.newInstance();
//        System.out.println(samosa2.hashCode());

        // saving using enum
//        Samosa2 samosa1=Samosa2.INSTANCE;
//        System.out.println(samosa1.hashCode());
//        Constructor<Samosa2> constructor = Samosa2.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa2 samosa2 = constructor.newInstance();
//        System.out.println(samosa2.hashCode());

        // breaking using deserialization
//        Samosa3 samosa=Samosa3.getSamosa();
//        System.out.println(samosa.hashCode());
//        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        objectOutputStream.writeObject(samosa);
//        System.out.println("Serialization done...");
//        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa3 samosa2=(Samosa3)objectInputStream.readObject();
//        System.out.println(samosa2.hashCode());

        // breaking using cloning
        Samosa3 samosa=Samosa3.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa3 samosa2=(Samosa3) samosa.clone();
        System.out.println(samosa2.hashCode());


    }
}

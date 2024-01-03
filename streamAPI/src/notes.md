# What is Stream API used for 
--> The Stream API is a powerful tool that can be used to process collections of objects in Java. 
--> It reduces the code length.
--> Stream is an interface

# Filter 
--> It takes Predicate as an argument 
# Map 
--> It takes Function as an argument 
--> Performs operation on each element 


# Optional class 
    In Java, the Optional class provides a way to handle nullable values in a more concise and expressive manner. 
    When working with Optional, it's important to understand the difference between the of and ofNullable methods. This
    article will delve into these methods and clarify their distinctions, allowing you to make informed decisions when
    using Optional in your Java code.

    1. Optional.of(value):
       The of method is used to create an Optional instance with a non-null value. It expects that the provided value is
       not null; otherwise, it throws a NullPointerException. By using of, you are asserting that the value is present.
    
    Example:
    
    String name = "John";
    Optional<String> optionalName = Optional.of(name);
    In this example, optionalName is created using Optional.of with the non-null value name. Since name is not null, 
    it is guaranteed that optionalName will contain a value.
    
    It’s important to note that if you pass a null value to Optional.of, it will throw a NullPointerException.
    
    2. Optional.ofNullable(value):
       The ofNullable method is used to create an Optional instance that may or may not contain a value. It can handle
       both non-null and null values. If the provided value is non-null, it will be wrapped in an Optional; otherwise, 
       it returns an empty Optional (Optional.empty()).
    
    Example:
    
    String address = null;
    Optional<String> optionalAddress = Optional.ofNullable(address);
    In this example, optionalAddress is created using Optional.ofNullable with the possibly null value address. If
    address is not null, optionalAddress will contain that value. However, if address is null, optionalAddress will
    be empty.
    
    By using ofNullable, you can safely handle cases where the value can be null without encountering a 
    NullPointerException.



*****************************************************END***********************************************************
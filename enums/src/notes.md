# enum
--> it's a special type of class that represents a group of constants (unchangeable variables, like final variables).
--> We don’t need to instantiate an enum using new, it has the same capabilities as other classes. This fact makes
    Java enumeration a very powerful tool. Just like classes, you can give them constructors, add instance variables 
    and methods, and even implement interfaces.
--> enum constants are public, static and final (unchangeable - cannot be overridden).
--> Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

# Declaration of enum in Java
--> Enum declaration can be done outside a Class or inside a Class but not inside a Method.

# Properties of Enum in Java
    There are certain properties followed by Enum as mentioned below:
    Every enum is internally implemented by using Class.
    Every enum constant represents an object of type enum.
    Enum type can be passed as an argument to switch statements.
    Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. Since it is final, we can’t create child enums.
    We can declare the main() method inside the enum. Hence we can invoke the enum directly from the Command Prompt.

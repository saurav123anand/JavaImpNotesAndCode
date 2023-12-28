# What is Design pattern
--> Design patterns are the well proved solution of commonly occurring problems in software design.
--> It provides an idea.

# Categorization of design pattern
1) Creational design pattern
   i) Factory pattern
   ii) Builder pattern
   iii) Singleton pattern etc 
2) Structural Design pattern 
   i) Proxy pattern
   ii) Adaptor pattern

3) Behavioral Design pattern ( for example how objects will interact with each other and loose coupling) 
   i) Observer pattern
   ii) State pattern
   iii) Iterator pattern

# 1. Singleton design pattern
--> When we only want to create one instance of class and want to reuse the same object

# How to break singleton pattern 
i) Reflection API to break singleton pattern
  # how to save our object from this 
    i) Solution 1 : if object is there ==> throw exception from inside constructor 
    ii) Solution 2 : Using enum 
ii) Using deserialization 
   # how to save our object from this 
   --> implementing readResolve method 
iii) Using cloning
   # how to save our object from this
   --> return the same object from override clone method 

# 2. Factory design pattern
--> When there is superclass and multiple subclasses and we want to get object of subclasses based on input and 
    requirement then we create factory class which takes the responsibility of creating object of class based on input

   ### Advantage of factory design pattern 
      --> focus on creating object for intergace rather than implementation 
      --> loose coupling,more robust code.

# 3. Abstract design pattern
--> Similar to factory design pattern 
--> It provides the concept of factory of factories 

# 4. Builder design pattern
--> While creating object when object contain many attributes there are many problem exists
   i) We have to pass many attributes to create object.
   ii) Some parameters may be optional.
   iii) Factory class takes all responsibility for creating object, if the object is heavy then all complexity 
        is the part of factory class.
  So in builder pattern create object step by step and finally return final object with desired values of attributes.

# 5. Prototype design type
--> the concept is to copy an existing object rather than creating a new instance from scratch because creating a new 
    object may be costly.
--> This approach saves costly resources and time, especially when object creation is a heavy process.


# Deep copy vs Shallow copy
--> Shallow copy=> when we are copying object(obj1) and obj1 having objects as attributes then reference will be copied
    of attributes not the actual object so if copied object changes the attributes value then it will reflect in obj1
    object attributes also 

--> Deep copy==> here actual object is copied with reference attributes , so obj2 changes will not reflect on obj1


# Observer design pattern 
--> It's behavioural design pattern.
--> In this when subject changes the state all its dependent objects notified the changes.
--> one to many relation.


  



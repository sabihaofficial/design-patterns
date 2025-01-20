The Factory Method Design Pattern is a creational design pattern that provides an **interface for creating objects in a superclass, allowing subclasses to alter the type of objects that will be created**. This pattern is particularly useful when the **exact types of objects to be created may vary or need to be determined at runtime, enabling flexibility and extensibility in object creation.**
It provides an interface for creating objects in a superclass while allowing subclasses to specify the types of objects they create.

This pattern simplifies the object creation process by placing it in a dedicated method, promoting loose coupling between the object creator and the objects themselves.
This approach enhances flexibility, extensibility, and maintainability, enabling subclasses to implement their own factory methods for creating specific object types.

Below is when to use Factory Method Design Pattern:

1. A class can't anticipate the class of objects it must create.
2. A class wants its subclass to specify the objects it creates.
3. Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate. 

![img_2.png](img_2.png)

**Components of Factory Method Design Pattern :**

1. **Creator:** 
This is an abstract class or an interface that declares the factory method. The creator typically contains a method that serves as a factory for creating objects. It may also contain other methods that work with the created objects.
2. **Concrete Creator:** 
Concrete Creator classes are subclasses of the Creator that implement the factory method to create specific types of objects. Each Concrete Creator is responsible for creating a particular product.
3. **Product:** 
This is the interface or abstract class for the objects that the factory method creates. The Product defines the common interface for all objects that the factory method can create.
4. **Concrete Product:** 
Concrete Product classes are the actual objects that the factory method creates. Each Concrete Product class implements the Product interface or extends the Product abstract class.

![img_1.png](img_1.png)

Advantage of factory pattern :  
The factory pattern allows client class(the class which needs to use the object) to instantiate the object without having to worry about its internal instantiation.
This avoids the overhead on client to check on the business logic as the factory will take care of it and give it to client.

Example :
Base class
1. Vehicle - Interface (gives the basic specification)
2. Car and Auto -  concrete classes (incharge of giving the actual method to implement the specification based on type)
3. VehicleFactory - Interface (gives the basic requirements for the factory of each type)
4. CarFactory - concrete class (Responsible to actually create the car object)
5. AutoFactory - concrete class (Responsible to actually create the car object)

Individual factories are required so that each type of object can be instantiated with any base logic.
For example in factory we can ask the carFactory to initialize the car object with 4 wheels, while the auto with 3
Thus the client creating these obejct wont have to worry on adding the wheels individually.

**This can also be done, by instantiating the child class object like car or auto, but ideally basic requirements should not be updated by client unless necessary.**


**When to use Factory Method Design Pattern?**
1. JDBC uses factories to create connections and statements. Frameworks like Spring and Guice utilize factories for managing beans.
2. Swing and JavaFX uses factories to produce UI components such as buttons and text fields, offering flexibility in design.
3. Tools like Log4j and Logback employ factories to create loggers with various configurations, allowing for control over logging levels.
4. Serialization frameworks use factories to generate objects from serialized data, accommodating different formats and versions.

**Advantages of Factory Method Design Pattern**
1. Separates object creation from client code, enhancing flexibility and maintainability since changes to creation don’t affect clients.
2. New product types can be easily added without altering client code by simply creating new Concrete Creator subclasses.
3. Simplifies unit testing by allowing mock product creation, enabling tests of various implementations without actual object dependencies.
4. The factory method can be reused across different application parts, centralizing and streamlining object creation logic.
5. Hides specific product classes from clients, reducing dependencies and improving maintainability.
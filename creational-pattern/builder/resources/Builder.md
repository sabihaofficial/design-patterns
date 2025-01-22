The Builder Pattern is a creational design pattern that separates the construction of complex objects from their representation, offering a cleaner and more flexible approach to object creation.
This pattern simplifies the object creation process by placing it in a dedicated method, promoting loose coupling between the object creator and the objects themselves.
This approach enhances flexibility, extensibility, and maintainability, enabling subclasses to implement their own factory methods for creating specific object types.

**Advantages of Builder Pattern**
1. **Flexibility** – by decoupling the construction process from the actual object representation, the Builder Pattern allows us to create objects with varying configurations without cluttering our codebase with multiple constructors or setters
2. **Readability** – the Builder Pattern provides fluent interfaces, making our code more readable; this enables us and fellow developers to understand the construction process of complex objects at a glance.
3. **Immutability** – builders can enforce immutability by creating immutable objects once the construction is complete; this ensures thread safety and prevents unintended modification.

In the classic implementation of the Builder Pattern, we create a separate Builder inner class. This inner class contains methods to set each property of the constructed object. This structured approach facilitates a sequential configuration process, ensuring clarity and ease of use. Additionally, it enhances code organization and readability, making it easier to understand and

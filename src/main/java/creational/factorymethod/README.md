# Factory Method
The Factory Method design pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate. It promotes loose coupling and ensures that the code depends on abstractions rather than concrete implementations.  
Key characteristics of the Factory Method design pattern include:
* **Interface-based object creation**: The pattern defines an abstract interface or base class for creating objects, allowing subclasses to provide the implementation. This promotes loose coupling and ensures client code depends on abstractions.

* **Delegation to subclasses**: The responsibility of object creation is delegated to subclasses, which determine the specific class to instantiate. This enables extensibility and allows for the creation of different types of objects without modifying existing code.

* **Flexibility and customization**: The Factory Method pattern provides flexibility in object creation by allowing subclasses or implementations to vary the products created based on different conditions or configurations. It facilitates customization and adaptability in the creation process.

* **Polymorphic object creation**: The pattern leverages polymorphism to create different types of objects through a common interface or abstract class. This enhances code flexibility, maintainability, and scalability.

* **Dependency inversion**: By depending on abstractions rather than concrete implementations, the Factory Method pattern adheres to the Dependency Inversion Principle. Client code depends on the abstract factory or interface, enabling easy swapping of implementations and promoting modular design.

* **Extensibility and scalability**: The pattern supports the addition of new product types or variations without modifying existing code. It allows for the creation of families of related objects and provides a foundation for building larger object hierarchies.

* **Dynamic object creation**: The Factory Method pattern enables the selection of the concrete class to instantiate at runtime. This flexibility allows for runtime decisions, such as object creation based on user input, configuration settings, or other runtime factors.

The Factory Method pattern provides an abstract interface for creating objects, with the actual creation logic delegated to subclasses. It promotes loose coupling, extensibility, flexibility in object creation, and adheres to the principles of object-oriented design.

### Example scenario used
##### Scenario
Imagine a restaurant that prides itself on its delicious burgers. Customers can place orders for various types of burgers, such as beef, chicken, or veggie. As the restaurant gains popularity, it wants to introduce new types of burgers, accommodating different dietary preferences and culinary innovations. However, modifying the existing codebase each time a new burger type is added would be impractical and violate the open-closed principle.

##### The Problem
The restaurant's current codebase relies on conditional statements (switch case or if-else) to determine the type of burger to create based on customer orders. As new burger types are introduced, the conditional statements grow, making the code harder to maintain and extend. Moreover, the code violates the single responsibility principle, as it handles both the business logic of creating burgers and the burger-specific logic.

##### The Solution: The Factory Method Pattern
To overcome these challenges, the restaurant adopts the Factory Method design pattern. They create an abstract base class called `Burger`, which defines a common interface for all burger types. Each specific burger type (beef, chicken, veggie, etc.) becomes a subclass of `Burger` and provides its own implementation of the creation logic by overriding methods called `prepare()`, `cook()` and `serve()`. We have a factory class named `BurgerFactory`, which decides which burger to be made from type provided. The factory method encapsulates the burger-specific creation logic, allowing each burger type to be created independently.
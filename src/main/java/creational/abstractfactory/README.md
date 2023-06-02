# Abstract Factory
Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It encapsulates the creation of multiple related objects, ensuring that the created objects are compatible and follow a common theme.

Key characteristics of the Abstract Factory pattern include:

* **Abstract Factory Interface**: Declares the methods for creating the abstract products (e.g., abstract methods to create different types of objects).
* **Concrete Factory Classes**: Implement the Abstract Factory interface to create specific families of products. Each concrete factory is responsible for creating a set of related products.
* **Abstract Product Interface**: Defines the interface for the abstract products. It declares the common methods that the concrete products will implement.
* **Concrete Product Classes**: Implement the Abstract Product interface to provide specific implementations for the products.
* **Product Families**: Each concrete factory creates a family of related products that are designed to work together.
* **Decoupling**: The client code is decoupled from the specific classes of products it uses. It works with the abstract interfaces provided by the abstract factory and product interfaces.
* **Flexible and Extensible**: New families of products can be introduced by creating new concrete factories and products without modifying existing client code.
* **Follows Open-Closed Principle**: The abstract factory and product interfaces are open for extension but closed for modification, allowing new variants of products to be added without changing existing code.  

The Abstract Factory pattern promotes the creation of families of related objects, providing an abstraction layer that allows the client code to work with different families of objects through a common interface. It is useful when there is a need to create multiple products that are designed to work together and vary based on a specific theme or context.

### Example scenario used
##### Scenario
You work for a computer shop called "Tech Haven," which specializes in selling computer components and peripherals. Your shop offers a wide range of products, including graphics processing units (GPUs) and monitors. Tech Haven sources GPUs and monitors from two renowned manufacturers, ASUS and MSI.
##### The Problem
Tech Haven wants to streamline its inventory management and improve customer satisfaction by implementing a more efficient system for handling GPU and monitor orders. Currently, the process of managing different types of GPUs and monitors from ASUS and MSI is time-consuming and error-prone. There is a need for a solution that simplifies the order management process and ensures accurate fulfillment of customer orders.
##### The Solution: The Factory Method Pattern
To address Tech Haven's problem, you propose the implementation of the Abstract Factory design pattern. The Abstract Factory pattern provides an interface for creating families of related products without specifying their concrete classes. In this case, you will create an abstract factory for GPUs and monitors, and concrete factories for ASUS and MSI products. This pattern will allow Tech Haven to create GPU and monitor objects from different manufacturers while encapsulating the creation logic within the factories.
# Singleton
A Singleton is a creational design pattern that ensures the existence of only one instance of a class in an application and provides a global point of access to that instance. It restricts the instantiation of a class to a single object, making it globally accessible throughout the application.

Key characteristics of a Singleton pattern include:

* Single Instance: The Singleton class ensures that only one instance of itself is created and maintained.

* Global Access: The single instance of the class is globally accessible, allowing other parts of the application to use it easily.

* Private Constructor: The Singleton class typically has a private constructor to prevent external instantiation of multiple objects.

* Static Instance Method: The Singleton class provides a static method that returns the single instance of the class, ensuring a consistent access point.

The Singleton pattern is useful in scenarios where having multiple instances of a class could cause issues with data consistency, resource management, or coordination between different parts of the application. By enforcing a single instance, the Singleton pattern ensures that there is a centralized and controlled access point to the class.

### Example scenario used
In this example, we have a singleton counter class named `SingletonCounter`. This class will have an integer named counter, which will be 0 initially.
It will have one private constructor, a private instance holder class, a method to get the counter value, and a method to increment the counter value.  

This example used the **Initialization-on-demand holder idiom**, also known as **Bill Pugh Singleton**, which is considered a good approach for implementing singletons that are thread safe.
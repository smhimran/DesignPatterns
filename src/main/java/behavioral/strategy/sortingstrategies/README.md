# Strategy Pattern
The Strategy pattern is a behavioral design pattern that allows you to define a family of interchangeable algorithms, encapsulate each one as a separate class, and make them interchangeable at runtime. It enables the selection of an algorithm dynamically without the client code being aware of the specific implementation being used.

Key characteristics of the Strategy pattern:

* **Encapsulation of Algorithms**: The pattern encapsulates each algorithm or strategy into separate classes, allowing them to be developed, modified, and tested independently of the client code. Each strategy class represents a specific algorithm or behavior.

* **Interface-based**: The strategies are defined through a common interface or abstract class, which establishes a contract for all the concrete strategies. This interface provides a common set of methods that clients can use to interact with the strategies without needing to know the specific implementation details.

* **Interchangeable Behavior**: The Strategy pattern allows different strategies to be selected and used interchangeably at runtime. The client code can switch between strategies by simply changing the reference to the desired strategy object. This provides flexibility and dynamic behavior.

* **Separation of Concerns**: The pattern promotes the separation of concerns by separating the algorithm implementation from the client code. The client code delegates the specific behavior to the selected strategy, reducing the complexity and coupling of the code.

* **Single Responsibility Principle**: Each strategy class has a single responsibility, which is to implement a specific algorithm or behavior. This promotes code organization, maintainability, and reusability.

* **Open-Closed Principle**: The Strategy pattern follows the open-closed principle by allowing the addition of new strategies without modifying the existing client code. The client code is open for extension (by adding new strategies) but closed for modification.

Overall, the Strategy pattern provides a flexible and modular approach to implement different algorithms or behaviors in a clean and maintainable way. It promotes code reusability, separation of concerns, and runtime interchangeability of strategies.

### Example scenario used
In this example, we are trying to sort a list. There are different sorting algorithms. So we used strategy pattern to create options for sorting using different sorting strategies.
We used `Selection Sort`, `Bubble Sort`, `Insertion Sort`, `Merge Sort`, and `Intro Sort` in this example.
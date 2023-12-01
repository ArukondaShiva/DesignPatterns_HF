## Template Method
- Defines the skeleton of algorithm in an operation, deffering some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm
  without changing the algorithm's structure.
- The Template Method Pattern gives us an important technique for code reuse.
- The template method’s abstract class may define concrete methods, abstract methods and hooks.
- Hooks are methods that do nothing or default behavior in the abstract class, but may be overridden in the subclass.
- To prevent subclasses from changing the algorithm in the template method, declare the template method as final.

## Design Principle
**Don't call us. we will call you.**
- The Hollywood Principle guides us to put decision-making in high-level modules that can decide how and when to call low level modules

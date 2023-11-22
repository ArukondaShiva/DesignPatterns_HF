## Factory Method
Defines an interface for creating an object, but let subclasses decide which class to instantiate.Factory Method lets a class defer instantiation to the subclasses.


## Abstract Factory Method
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

An Abstract Factory provides an interface for a family of products. what's a family? In this example, it's all the things we need to make a pizza: dough,sauce,cheese,meats and veggies.

## Factory & Abstract Factory
- They both are really good at decoupling applications from specific implementations in different ways
- Factory Pattern creates objects through inheritence and abstract factory pattern creates through composition.
- to create objects using factory method, we need to extend a class and provide implementation for factory method.this subclass do create objects for us.
  clients only need to know the abstract type they are using, the subclass worries about the concrete type.so in other words it keep clients decoupled from the concrete types.
- Abstract factory pattern provides an abstract type for creating products.subclasses of these types defines how those products are produced.to use the factory,you instantiate
  one and pass it ino some code that is written agaist the abstract type. clients are decoupled from the actual concrete products they use.
- inside Abstract factory method. concrete factories must implement factory method to create their products.
- both encapsulate object creation to keep applications loosely coupled and less dependent on implementations.





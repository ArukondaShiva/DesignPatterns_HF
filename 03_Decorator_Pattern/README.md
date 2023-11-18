## Decorator Design Pattern
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Class Diagram(Sample)
![WhatsApp Image 2023-11-18 at 12 33 32 PM](https://github.com/ArukondaShiva/DesignPatterns_HF/assets/49832102/f9bef80d-72ba-4018-b7bf-da58468c1846)

- we are using inheritance to achieve type matching, but we are not using inheritance to get behavior
 The behavior comes in throgh the composition of decorators with the base components as well as other decorators

- if we rely on inheritance for behavior, then our beaviour can only be determined  statically at compile time. in other words we get only whatever behavior super class gives us or that we override. with composition we can mix and match decorators any way we
like(runtime)

- if we use inheritance we would have to go in and change existing code anytime we wanted new behavior(violation of open closed principle).

## Class Diagram(For above example-StarbuzzCoffee)
![DecoratorPatternBeverage](https://github.com/ArukondaShiva/DesignPatterns_HF/assets/49832102/111d0ee6-c569-4cfb-8cac-e180f6206280)

## Design Principles
Classes should be open for extension and closed for modification.

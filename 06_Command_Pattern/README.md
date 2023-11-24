## Command Pattern
Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

- The Command Pattern decouples an object making a request from the one that knows how to perform it.
- A Command object is the center of this decoupling and encapsulates a receiver with an action(or set of actions).
- An invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
- invokers parameterized with Commands,even dynamically at runtime

## class Diagram(Template)
![CommandTemplate drawio](https://github.com/ArukondaShiva/DesignPatterns_HF/assets/49832102/15fe4366-96e5-43dd-96b9-bf3e043d95ea)

## class Diagram(Home Automation-Remote)
![CP drawio](https://github.com/ArukondaShiva/DesignPatterns_HF/assets/49832102/17458e10-0fd3-4894-9c32-f8927e6024a8)

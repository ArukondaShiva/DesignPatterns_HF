## Command Pattern
Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

- The Command Pattern decouples an object making a request from the one that knows how to perform it.
- A Command object is the center of this decoupling and encapsulates a receiver with an action(or set of actions).
- An invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
- invokers parameterized with Commands,even dynamically at runtime

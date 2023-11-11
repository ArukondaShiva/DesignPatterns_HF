package DuckImpl;

import FlyBehaviorImpl.FlyBehavior;
import FlyBehaviorImpl.FlyNoWay;
import QuackBehaviorImpl.Quack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
      
        System.out.println("I am a Rubber Duck");

    }
    
}

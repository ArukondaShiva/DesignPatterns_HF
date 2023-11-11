package DuckImpl;

import FlyBehaviorImpl.FlyBehavior;
import FlyBehaviorImpl.FlyWithWings;
import QuackBehaviorImpl.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
      System.out.println("Iam a Redhead Duck");
    }
    
}

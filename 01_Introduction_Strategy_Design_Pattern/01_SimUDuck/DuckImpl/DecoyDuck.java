package DuckImpl;

import FlyBehaviorImpl.FlyNoWay;
import QuackBehaviorImpl.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
      
        System.out.println("I am a Decoy Duck");

    }
    
}

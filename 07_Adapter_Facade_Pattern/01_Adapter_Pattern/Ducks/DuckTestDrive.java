import AdapterImpl.TurkeyAdapter;
import DuckImpl.Duck;
import DuckImpl.MallardDuck;
import TurkeyImpl.Turkey;
import TurkeyImpl.WildTurkey;

public class DuckTestDrive {
    
    public static void main(String[] args) {
        
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);
        
        testDuck(turkeyAdapter);
        
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
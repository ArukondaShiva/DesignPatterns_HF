import AdapterImpl.DuckAdapter;
import DuckImpl.Duck;
import DuckImpl.MallardDuck;
import TurkeyImpl.Turkey;
import TurkeyImpl.WildTurkey;

public class TurkeyTestDrive {
    
    public static void main(String[] args) {
        
        Turkey turkey = new WildTurkey();
        Duck duck = new MallardDuck();
        
        testTurkey(turkey);

        Turkey duckAdapter = new DuckAdapter(duck);
        testTurkey(duckAdapter);

    }

    public static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }

}

import DuckImpl.DecoyDuck;
import DuckImpl.Duck;
import DuckImpl.MallardDuck;
import DuckImpl.ModelDuck;
import FlyBehaviorImpl.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

         Duck mallard = new MallardDuck();
         mallard.performFly();
         mallard.performQuack();


         Duck model = new ModelDuck();
         model.performFly();
         model.setFlyBehavior(new FlyRocketPowered());
         model.performFly();


         System.out.println("decoy duck : ");
         Duck decoy = new DecoyDuck();
         decoy.performFly();
         decoy.performQuack();

    }
}
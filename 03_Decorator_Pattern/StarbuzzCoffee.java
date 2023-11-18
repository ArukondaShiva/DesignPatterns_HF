import BeverageImpl.Beverage;
import BeverageImpl.DarkRoast;
import BeverageImpl.Espresso;
import BeverageImpl.HouseBlend;
import CondimentDecoratorImpl.Mocha;
import CondimentDecoratorImpl.Soy;
import CondimentDecoratorImpl.Whip;

public class StarbuzzCoffee {
    
    public static void main(String[] args) {

        // 1.Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"- $"+beverage.cost());
        

        // 2.DarkRoast -> with Mocha,Mocha,Whip
        Beverage beverage2 = new DarkRoast();

        beverage2 = new Mocha(beverage2);        
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"- $"+beverage2.cost());


        // 3.HouseBlend -> with Soy,Mocha,Whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+"- $"+beverage3.cost());

    }

}

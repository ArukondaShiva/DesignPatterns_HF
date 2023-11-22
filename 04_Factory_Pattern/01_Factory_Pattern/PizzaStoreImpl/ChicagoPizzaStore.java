package PizzaStoreImpl;

import PizzaImpl.ChicagoStyleCheesePizza;
import PizzaImpl.ChicagoStyleClamPizza;
import PizzaImpl.ChicagoStylePepperoniPizza;
import PizzaImpl.ChicagoStyleVeggiePizza;
import PizzaImpl.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String item) {
       if (item.equals("cheese")) {
         return new ChicagoStyleCheesePizza();
       }
       else if (item.equals("pepperoni")) {
          return new ChicagoStylePepperoniPizza();
       }
       else if (item.equals("clam")) {
          return new ChicagoStyleClamPizza();
       }
       else if(item.equals("veggie")){
          return new ChicagoStyleVeggiePizza();
       }
       else{
        return null;
       }
    }
    
}

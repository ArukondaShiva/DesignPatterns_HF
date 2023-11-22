import PizzaImpl.Pizza;
import PizzaStoreImpl.ChicagoPizzaStore;
import PizzaStoreImpl.NYPizzaStore;
import PizzaStoreImpl.PizzaStore;

public class PizzaTestDrive {
    
    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Rajiv ordered a "+pizza+"\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("pavan ordered a "+pizza+"\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Rajiv ordered a "+pizza+"\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("pavan ordered a "+pizza+"\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Rajiv ordered a "+pizza+"\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("pavan ordered a"+pizza+"\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("rajiv ordered a "+pizza+"\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("pavan ordered a "+pizza+"\n");

    }

}

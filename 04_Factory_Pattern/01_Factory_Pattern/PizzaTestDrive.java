import PizzaImpl.Pizza;
import PizzaStoreImpl.ChicagoPizzaStore;
import PizzaStoreImpl.NYPizzaStore;
import PizzaStoreImpl.PizzaStore;

public class PizzaTestDrive {
    
    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Prem ordered a "+ pizza1.getName());

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Shiva ordered a "+pizza2.getName());

    }

}

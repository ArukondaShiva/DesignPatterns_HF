package PizzaIngredientFactoryImpl;

import IngredientsImpl.Cheese;
import IngredientsImpl.Clams;
import IngredientsImpl.Dough;
import IngredientsImpl.Pepperoni;
import IngredientsImpl.Sauce;
import IngredientsImpl.Veggies;

public interface PizzaIngredientFactory{
    
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}

package PizzaIngredientFactoryImpl;

import IngredientsImpl.Cheese;
import IngredientsImpl.Clams;
import IngredientsImpl.Dough;
import IngredientsImpl.FreshClams;
import IngredientsImpl.Garlic;
import IngredientsImpl.MarinaraSauce;
import IngredientsImpl.Mushroom;
import IngredientsImpl.Onion;
import IngredientsImpl.Pepperoni;
import IngredientsImpl.RedPepper;
import IngredientsImpl.ReggianoCheese;
import IngredientsImpl.Sauce;
import IngredientsImpl.SlicedPepperoni;
import IngredientsImpl.ThinCrustDough;
import IngredientsImpl.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
         return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
         return new FreshClams();
    }
    
}

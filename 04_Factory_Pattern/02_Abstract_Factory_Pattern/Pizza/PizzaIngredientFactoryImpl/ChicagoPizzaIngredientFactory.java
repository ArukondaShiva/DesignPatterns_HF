package PizzaIngredientFactoryImpl;

import IngredientsImpl.BlackOlives;
import IngredientsImpl.Cheese;
import IngredientsImpl.Clams;
import IngredientsImpl.Dough;
import IngredientsImpl.Eggplant;
import IngredientsImpl.FrozenClams;
import IngredientsImpl.MozzarellaCheese;
import IngredientsImpl.Pepperoni;
import IngredientsImpl.PlumTomatoSauce;
import IngredientsImpl.Sauce;
import IngredientsImpl.SlicedPepperoni;
import IngredientsImpl.Spinach;
import IngredientsImpl.ThickCrustDough;
import IngredientsImpl.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
       return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
       return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
       return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
       Veggies veggies[] = {new BlackOlives(), new Spinach(),new Eggplant()};
       return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
    
}

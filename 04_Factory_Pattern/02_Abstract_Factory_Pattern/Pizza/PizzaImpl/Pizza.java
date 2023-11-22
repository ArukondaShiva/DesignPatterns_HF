package PizzaImpl;

import IngredientsImpl.Cheese;
import IngredientsImpl.Clams;
import IngredientsImpl.Dough;
import IngredientsImpl.Pepperoni;
import IngredientsImpl.Sauce;
import IngredientsImpl.Veggies;

public abstract class Pizza {
    
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 20 minutes at 250");
    }

    public void cut(){
        System.out.println("Cutting Pizza into diagonal pieces");
    }

    public void box(){
        System.out.println("place Pizza in PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
       	StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
    }

}
package PizzaImpl;

import java.util.ArrayList;

public abstract class Pizza {
    
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("prepare - "+name);
        System.out.println("Tossing dough....");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings:");
        
        for(String topping : toppings){
           System.out.println("  "+topping);
        }
    }

    public void bake(){
         System.out.println("Bake for 20 min at 200");
    }

    public void cut(){
         System.out.println("Cut the pizza into diagonal slices");
    }

    public void box(){
         System.out.println("Place the pizza in pizza store box");
    }

    public String getName(){
        return name;
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
		display.append("-- " + name + " --\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
    }

}

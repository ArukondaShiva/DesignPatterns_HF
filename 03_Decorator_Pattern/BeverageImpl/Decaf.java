package BeverageImpl;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
       return 0.55;
    }
    
}

public class BeverageTestDrive {
    
    public static void main(String[] args) {
        
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        System.out.println("\nMaking a tea...");
        myTea.prepareRecipe();

        System.out.println("\nMaking the Coffee...");
        myCoffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        myCoffee.prepareRecipe();

    }

}

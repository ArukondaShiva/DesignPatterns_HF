import java.util.Arrays;

public class DuckSortTestDrive {
    
    public static void main(String[] args) {
        
        Duck[] ducks = {
                         new Duck("Daffy", 8),
                         new Duck("Dewey", 2),
                         new Duck("Boward", 7),
                         new Duck("Louie", 2),
                         new Duck("Donald", 10),
                         new Duck("Huey", 2)
        };

        System.out.println("Before Sorting.....");
        display(ducks);
        
        Arrays.sort(ducks);

        System.out.println("\nAfter Sorting.....");
        display(ducks);

    }


    public static void display(Duck[] ducks){
        for(Duck d : ducks){
            System.out.println(d);
        }
    }

}

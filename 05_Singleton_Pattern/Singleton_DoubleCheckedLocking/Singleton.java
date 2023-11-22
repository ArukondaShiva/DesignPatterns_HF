package Singleton_DoubleCheckedLocking;

public class Singleton{

     private volatile static Singleton uniqueInstance; 


     //making constructor private
     private Singleton(){
      
     }

    
     public static Singleton getInstance(){

        if(uniqueInstance==null){
            synchronized(Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
     }


}
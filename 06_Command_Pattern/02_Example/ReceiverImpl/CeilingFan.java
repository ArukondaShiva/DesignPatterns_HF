package ReceiverImpl;

public class CeilingFan {

    String location="";
    int level;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    public CeilingFan(String location){
        this.location = location;
    }

    public void high(){
       level = HIGH;
       System.out.println(location+" ceiling fan is on HIGH");
    }

    public void medium(){
        level = MEDIUM;
        System.out.println(location+" ceiling fan is on MEDIUM");
    }

    public void low(){
        level = LOW;
        System.out.println(location+" ceiling fan is on LOW");
    }
    
    public void on(){
        System.out.println(location+" CeilingFan On");
    }

    public void off(){
        level = OFF;
        System.out.println(location+" CeilingFan Off");
    }

    public int getSpeed(){
        return level;
    }

}

package ReceiverImpl;

public class CeilingFan {

    String location="";
    int speed;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void high(){
       speed = HIGH;
       System.out.println(location+" ceiling fan is on HIGH");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location+" ceiling fan is on MEDIUM");
    }

    public void low(){
        speed = LOW;
        System.out.println(location+" ceiling fan is on LOW");
    }
    
    public void on(){
        System.out.println(location+" CeilingFan On");
    }

    public void off(){
        speed = OFF;
        System.out.println(location+" CeilingFan Off");
    }

    public int getSpeed(){
        return speed;
    }

}

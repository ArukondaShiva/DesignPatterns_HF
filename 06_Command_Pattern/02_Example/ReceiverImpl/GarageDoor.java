package ReceiverImpl;

public class GarageDoor {

    String location;

    public GarageDoor(String location){
        this.location = location;
    }

    public void up(){
        System.out.println(location+" GarageDoor is Up");
    }

    public void down(){
        System.out.println(location+" GarageDoor is Down");
    }

    public void stop(){
        System.out.println(location+" GarageDoor is stop");
    }
    
    public void lightOn(){
        System.out.println(location+" GarageDoor Light is On");
    }

    public void lightOff(){
        System.out.println(location+" GarageDoor Light is Off");
    }

}


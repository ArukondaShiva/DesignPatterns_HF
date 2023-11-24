package ReceiverImpl;

public class Stereo{

    String location;

    public Stereo(String location){
        this.location = location;
    }
 
    public void on(){
       System.out.println(location+" Stereo is On");
    }

    public void off(){
        System.out.println(location+" Stereo is Off");
    }

    public void setCd(){
        System.out.println(location+" Stereo is set up for CD input");
    }

    public void setDvd(){
        System.out.println(location+" Stereo is set up for DVD input");
    }

    public void setRadio(){
        System.out.println(location+" Stereo is set for Radio");
    }

    public void setVolume(int volume){
        System.out.println(location+" stereo volume set to "+volume);
    }
    
}

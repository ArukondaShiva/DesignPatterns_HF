import CommandImpl.GarageDoorOpenCommand;
import CommandImpl.LightOnCommand;
import ReceiverImpl.GarageDoor;
import ReceiverImpl.Light;
import RemoteImpl.SimpleRemoteControl;

public class RemoteControlTest {
    
    public static void main(String[] args) {
        
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(doorOpen);
        remote.buttonWasPressed();

    }

}

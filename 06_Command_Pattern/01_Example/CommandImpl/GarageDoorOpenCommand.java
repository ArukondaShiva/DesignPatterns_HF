package CommandImpl;

import ReceiverImpl.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
       garageDoor.openDoor();
    }
    
}

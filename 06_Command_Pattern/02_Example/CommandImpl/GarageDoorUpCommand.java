package CommandImpl;

import ReceiverImpl.GarageDoor;

public class GarageDoorUpCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
    
}

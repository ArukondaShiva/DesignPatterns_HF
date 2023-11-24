package CommandImpl;

import ReceiverImpl.CeilingFan;

public class CeilingFanMediumCommand implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
       prevSpeed = ceilingFan.getSpeed();
       ceilingFan.medium();
    }

    @Override
    public void undo() {
        if(prevSpeed==ceilingFan.HIGH){
            ceilingFan.medium();
        }
        else if(prevSpeed==ceilingFan.MEDIUM){
            ceilingFan.medium();
        }
        else if (prevSpeed==ceilingFan.LOW) {
            ceilingFan.low();
        }
        else if(prevSpeed==ceilingFan.OFF){
            ceilingFan.off();
        }
    }
    


}

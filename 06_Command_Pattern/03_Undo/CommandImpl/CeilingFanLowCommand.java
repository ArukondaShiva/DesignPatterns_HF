package CommandImpl;

import ReceiverImpl.CeilingFan;

public class CeilingFanLowCommand implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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


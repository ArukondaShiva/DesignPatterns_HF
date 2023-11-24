package RemoteControlImpl;
import CommandImpl.Command;
import CommandImpl.NoCommand;

public class RemoteControl{

    Command[] onCommands;
    Command[] offCommands; 
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();

        for(int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }


    public void setCommand(int slot,Command onCommand,Command offCommand){
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");

        for(int i=0;i<onCommands.length;i++){
            sb.append("[slot-"+i+"] "+onCommands[i].getClass().getName()+"    "+offCommands[i].getClass().getName()+"\n");
        }

        return sb.toString();
    }

}

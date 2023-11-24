import CommandImpl.CeilingFanHighCommand;
import CommandImpl.CeilingFanMediumCommand;
import CommandImpl.CeilingFanOffCommand;
import CommandImpl.CeilingFanOnCommand;
import CommandImpl.GarageDoorDownCommand;
import CommandImpl.GarageDoorUpCommand;
import CommandImpl.LightOffCommand;
import CommandImpl.LightOnCommand;
import CommandImpl.StereoOffWithCDCommand;
import CommandImpl.StereoOnWithCDCommand;
import ReceiverImpl.CeilingFan;
import ReceiverImpl.GarageDoor;
import ReceiverImpl.Light;
import ReceiverImpl.Stereo;
import RemoteControlImpl.RemoteControl;

public class RemoteLoader {
    
    public static void main(String[] args) {
        
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light KitchenRoomLight = new Light("Kitchen Room");
        // CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOn = new LightOnCommand(KitchenRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(KitchenRoomLight);

        // CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        // CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        // remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        // remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        // remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);

        // System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPressed();

        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPressed();


      

        //Ceiling Fan

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan); 
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);


        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println(remoteControl);
        
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        
    }

}

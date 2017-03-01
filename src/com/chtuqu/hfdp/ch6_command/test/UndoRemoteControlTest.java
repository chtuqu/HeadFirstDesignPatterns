package com.chtuqu.hfdp.ch6_command.test;

import com.chtuqu.hfdp.ch6_command.command.impl.LightOffCommand;
import com.chtuqu.hfdp.ch6_command.command.impl.LightOnCommand;
import com.chtuqu.hfdp.ch6_command.dto.Light;
import com.chtuqu.hfdp.ch6_command.remote_control.RemoteControl;

public class UndoRemoteControlTest {
    public static void main(String[] args) {
        int numberOfSlots = 7;
        RemoteControl remoteControl = new RemoteControl(numberOfSlots);

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
    }
}

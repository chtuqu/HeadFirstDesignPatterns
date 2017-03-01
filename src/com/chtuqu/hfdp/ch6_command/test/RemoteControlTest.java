package com.chtuqu.hfdp.ch6_command.test;

import com.chtuqu.hfdp.ch6_command.command.impl.*;
import com.chtuqu.hfdp.ch6_command.dto.CeilingFan;
import com.chtuqu.hfdp.ch6_command.dto.GarageDoor;
import com.chtuqu.hfdp.ch6_command.dto.Light;
import com.chtuqu.hfdp.ch6_command.dto.Stereo;
import com.chtuqu.hfdp.ch6_command.remote_control.RemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        int numberOfSlots = 7;
        RemoteControl remoteControl = new RemoteControl(numberOfSlots);

        // create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        // create commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // set commands
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOn, stereoOff);

        System.out.println(remoteControl);

        // try commands
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.onButtonPushed(3);
        remoteControl.offButtonPushed(3);
        remoteControl.onButtonPushed(4);
        remoteControl.offButtonPushed(4);
    }
}

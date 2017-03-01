package com.chtuqu.hfdp.ch6_command.test;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.command.impl.*;
import com.chtuqu.hfdp.ch6_command.dto.Light;
import com.chtuqu.hfdp.ch6_command.dto.Stereo;
import com.chtuqu.hfdp.ch6_command.remote_control.RemoteControl;

public class PartyRemoteControlTest {
    public static void main(String[] args) {
        int numberOfSlots = 7;
        RemoteControl remoteControl = new RemoteControl(numberOfSlots);

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { lightOn, stereoOn };
        Command[] partyOff = { lightOff, stereoOff };

        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("=== Pushing Macro On ===");
        remoteControl.onButtonPushed(0);
        System.out.println("=== Pushing Macro Off ===");
        remoteControl.offButtonPushed(0);
    }
}

package com.chtuqu.hfdp.ch6_command.test;

import com.chtuqu.hfdp.ch6_command.command.impl.LightOnCommand;
import com.chtuqu.hfdp.ch6_command.dto.Light;
import com.chtuqu.hfdp.ch6_command.remote_control.SimpleRemoteControl;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}

package com.chtuqu.hfdp.ch6_command.test;

import com.chtuqu.hfdp.ch6_command.command.impl.CeilingFanHighCommand;
import com.chtuqu.hfdp.ch6_command.command.impl.CeilingFanMediumCommand;
import com.chtuqu.hfdp.ch6_command.command.impl.CeilingFanOffCommand;
import com.chtuqu.hfdp.ch6_command.dto.CeilingFan;
import com.chtuqu.hfdp.ch6_command.remote_control.RemoteControl;

public class StatefulCommandRemoteControlTest {
    public static void main(String[] args) {
        int numberOfSlots = 7;
        RemoteControl remoteControl = new RemoteControl(numberOfSlots);

        CeilingFan fan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(fan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(fan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();

        remoteControl.onButtonPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
    }
}

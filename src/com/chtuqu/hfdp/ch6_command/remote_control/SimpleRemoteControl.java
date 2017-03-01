package com.chtuqu.hfdp.ch6_command.remote_control;

import com.chtuqu.hfdp.ch6_command.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() { }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

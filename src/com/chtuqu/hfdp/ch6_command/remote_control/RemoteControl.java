package com.chtuqu.hfdp.ch6_command.remote_control;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.command.impl.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Remote Control =====\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("slot [" + i + "] ");
            sb.append(onCommands[i].getClass().getName() + "\t");
            sb.append(offCommands[i].getClass().getName() + "\n");
        }
        sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return sb.toString();
    }
}

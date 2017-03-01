package com.chtuqu.hfdp.ch6_command.command.impl;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.command.util.CeilingFanUndoer;
import com.chtuqu.hfdp.ch6_command.dto.CeilingFan;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed = CeilingFan.Speed.MEDIUM;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        CeilingFanUndoer.undoCeilingFanCommand(ceilingFan, prevSpeed);
    }
}

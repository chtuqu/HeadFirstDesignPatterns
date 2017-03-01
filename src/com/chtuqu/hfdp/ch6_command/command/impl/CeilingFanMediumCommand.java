package com.chtuqu.hfdp.ch6_command.command.impl;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.command.util.CeilingFanUndoer;
import com.chtuqu.hfdp.ch6_command.dto.CeilingFan;

public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed = CeilingFan.Speed.MEDIUM;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        CeilingFanUndoer.undoCeilingFanCommand(ceilingFan, prevSpeed);
    }
}

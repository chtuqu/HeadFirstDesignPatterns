package com.chtuqu.hfdp.ch6_command.command.impl;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.dto.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}

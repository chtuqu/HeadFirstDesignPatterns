package com.chtuqu.hfdp.ch6_command.command.impl;

import com.chtuqu.hfdp.ch6_command.command.Command;
import com.chtuqu.hfdp.ch6_command.dto.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

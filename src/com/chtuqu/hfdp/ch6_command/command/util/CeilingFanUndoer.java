package com.chtuqu.hfdp.ch6_command.command.util;

import com.chtuqu.hfdp.ch6_command.dto.CeilingFan;

public class CeilingFanUndoer {
    public static void undoCeilingFanCommand(CeilingFan fan, CeilingFan.Speed prevSpeed) {
        switch (prevSpeed) {
            case OFF:
                fan.off();
                break;
            case LOW:
                fan.low();
                break;
            case MEDIUM:
                fan.medium();
                break;
            case HIGH:
                fan.high();
                break;
        }
    }
}

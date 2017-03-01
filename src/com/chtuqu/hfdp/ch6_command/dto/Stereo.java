package com.chtuqu.hfdp.ch6_command.dto;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void setCD() {
        System.out.println(name + " is set for CD input");
    }

    public void setVolume(int level) {
        System.out.println(name + " volume set to " + level);
    }

    public void on() {
        System.out.println(name + " stereo is On");
    }

    public void off() {
        System.out.println(name + " stereo is Off");
    }
}

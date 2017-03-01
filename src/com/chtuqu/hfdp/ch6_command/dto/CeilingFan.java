package com.chtuqu.hfdp.ch6_command.dto;

public class CeilingFan {
    private String name;
    private Speed speed;

    public CeilingFan(String name) {
        this.name = name;
        this.speed = Speed.OFF;
    }

    public void low() {
        speed = Speed.LOW;
        System.out.println(name + " ceiling fan is on Low");
    }

    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println(name + " ceiling fan is on Medium");
    }

    public void high() {
        speed = Speed.HIGH;
        System.out.println(name + " ceiling fan is on High");
    }

    public void off() {
        speed = Speed.OFF;
        System.out.println(name + " ceiling fan is Off");
    }

    public Speed getSpeed() {
        return speed;
    }

    public enum Speed { OFF, LOW, MEDIUM, HIGH }
}

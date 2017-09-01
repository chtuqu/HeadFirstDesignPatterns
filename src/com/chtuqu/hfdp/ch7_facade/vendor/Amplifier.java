package com.chtuqu.hfdp.ch7_facade.vendor;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
    }

    public void on() {

    }

    public void off() {

    }

    public void setCd() {

    }

    public void setDvd() {

    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {

    }

    public void setTuner() {

    }

    public void setVolume(int level) {

    }
}

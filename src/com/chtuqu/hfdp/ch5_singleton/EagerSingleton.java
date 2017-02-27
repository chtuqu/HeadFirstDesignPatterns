package com.chtuqu.hfdp.ch5_singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return singleton;
    }
}

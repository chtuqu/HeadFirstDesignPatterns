package com.chtuqu.hfdp.ch5_singleton;

public class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton singleton;

    private NonThreadSafeSingleton() { }

    public static NonThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new NonThreadSafeSingleton();
        }
        return singleton;
    }
}

package com.chtuqu.hfdp.ch5_singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() { }

    // NOTE: it's too expensive to always go through a synchronized method once you need an instance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}

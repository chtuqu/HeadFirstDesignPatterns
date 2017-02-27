package com.chtuqu.hfdp.ch5_singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton() { }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}

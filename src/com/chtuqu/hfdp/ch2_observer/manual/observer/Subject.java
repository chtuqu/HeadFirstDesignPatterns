package com.chtuqu.hfdp.ch2_observer.manual.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

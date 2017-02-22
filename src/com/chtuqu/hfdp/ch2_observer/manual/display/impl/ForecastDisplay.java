package com.chtuqu.hfdp.ch2_observer.manual.display.impl;

import com.chtuqu.hfdp.ch2_observer.manual.display.DisplayElement;
import com.chtuqu.hfdp.ch2_observer.manual.observer.Observer;
import com.chtuqu.hfdp.ch2_observer.manual.observer.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

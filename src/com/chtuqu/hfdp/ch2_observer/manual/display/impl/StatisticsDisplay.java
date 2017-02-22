package com.chtuqu.hfdp.ch2_observer.manual.display.impl;

import com.chtuqu.hfdp.ch2_observer.manual.observer.impl.WeatherData;
import com.chtuqu.hfdp.ch2_observer.manual.display.DisplayElement;
import com.chtuqu.hfdp.ch2_observer.manual.observer.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp;
    private float minTemp = 200;
    private float tempSum;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + tempSum / numReadings
                + "/" + maxTemp + "/" + minTemp);
    }
}

package com.chtuqu.hfdp.ch2_observer.manual.observer.impl;

import com.chtuqu.hfdp.ch2_observer.manual.display.impl.CurrentConditionsDisplay;
import com.chtuqu.hfdp.ch2_observer.manual.display.impl.ForecastDisplay;
import com.chtuqu.hfdp.ch2_observer.manual.display.impl.HeatIndexDisplay;
import com.chtuqu.hfdp.ch2_observer.manual.display.impl.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

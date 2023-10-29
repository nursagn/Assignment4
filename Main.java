package org.example;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Display display1 = new Display();
        Display display2 = new Display();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Simulate weather changes
        weatherStation.setMeasurements(25.0f, 60.0f, 1013.0f);
        weatherStation.setMeasurements(26.0f, 65.0f, 1012.0f);

        // Unregister one display
        weatherStation.removeObserver(display2);

        // Simulate more weather changes
        weatherStation.setMeasurements(24.5f, 62.0f, 1014.0f);
    }
}

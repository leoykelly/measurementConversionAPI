package edu.matc;

/**
 * Created by sandi schwert on 4/6/17.
 */
public class TemperatureMath {

    public double convertCelsiusToFahrenheit(double temperature) {
        double convertedTemp = (temperature * 1.8) + 32;
        /* °F = (°C * 1.8) + 32 */
        return convertedTemp;
    }

    public double convertCelsiusToKelvin(double temperature) {
        double convertedTemp = temperature - 273.15;
        return convertedTemp;
    }

    public double convertFahrenheitToCelsius(double temperature) {
        double convertedTemp = (temperature - 32) * 5 / 9;
        /* C = (°F - 32) * 5 / 9 */
        return convertedTemp;
    }

    public double convertFahrenheitToKelvin(double temperature) {
        double celsiusTemp = convertFahrenheitToCelsius(temperature);
        double convertedTemp = convertCelsiusToKelvin(celsiusTemp);
        return convertedTemp;
    }


    public double convertKelvinToCelsius(double temperature) {
        double convertedTemp = temperature + 273.15;
        return convertedTemp;
    }

    public double convertKelvinToFahrenheit(double temperature) {
        double celsiusTemp = convertKelvinToCelsius(temperature);
        double convertedTemp = convertCelsiusToFahrenheit(celsiusTemp);
        return convertedTemp;
    }


}

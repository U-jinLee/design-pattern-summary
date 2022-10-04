package _observer;


public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 4f);
        weatherData.setMeasurements(75, 70, 4f);
        weatherData.setMeasurements(80, 65, 4f);
    }

}

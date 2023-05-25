package wheather;

public class MainClass {
    public static void main(String[] args) {
        IObserver conditionsMonitor = new ConditionsMonitor();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(conditionsMonitor);

        weatherStation.setHumidity(120.0);
    }
}

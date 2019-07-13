package pl.sda;

import org.apache.commons.io.IOUtils;
import pl.sda.model.Current;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("ABRAKDABRA");

        WeatherService weatherService = new WeatherService(
          "http://api.apixu.com/v1/current.json",
           "8378abafd53249d8bfa81431191307"
        );

        //System.out.println(weatherService.getCityWeather("Katowice"));

        Current current = weatherService.getCityWeather("Katowice");
        System.out.println(current.getTemp_c());

    }
}

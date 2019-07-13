package pl.sda;

import org.apache.commons.io.IOUtils;
import pl.sda.model.Current;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // System.out.println("ABRAKDABRA");

        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "8378abafd53249d8bfa81431191307"
        );

        //System.out.println(weatherService.getCityWeather("Katowice"));

        Current current = weatherService.getCityWeather("Zamosc"); // nie uzywac polskich znakow oraz chyba nie dziala dla Warszawy i Lublina
        System.out.println("TEMPERATURA: " + current.getTemp_c() + " St.C");
        System.out.println("Zachmurzenie: " + current.getCloud() + " % nieba");
        System.out.println("Samopoczucie : " + current.getFeelslike_c());
        System.out.println("Wilgotność : " + current.getHumidity() + " % ");
        System.out.println("PORA: dzień 1 | noc 0: " + current.getIs_day());
        System.out.println("Ciśnienie : " + current.getPressure_in() + " hPa");
        System.out.print("Siła wiatru: " + current.getWind_kph() + " km/h" +
                " w porywach do : " + current.getGust_kph() + " km/h");
    }
}

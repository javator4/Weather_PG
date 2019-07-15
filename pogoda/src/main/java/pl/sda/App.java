package pl.sda;

import org.apache.commons.io.IOUtils;
import pl.sda.model.Current;

import org.apache.log4j.Logger;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sda.model.Current;
import pl.sda.model.Location;
import pl.sda.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;


// projekt PAweł Grabowski

/**
 * Hello world!
 *
 */
public class App {
    private static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args ) {
        // System.out.println("ABRAKDABRA");
        logger.info("URUCHOMIENIE APLIKACJI");
        logger.warn("WARNING");
        logger.debug("DEBUG");
        logger.error("ERROR");

        String url =
                "http://api.apixu.com/v1/current.json" +
                        "?key=8378abafd53249d8bfa81431191307&q=Paris";

        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "8378abafd53249d8bfa81431191307"
        );

        //System.out.println(weatherService.getCityWeather("Katowice"));
        WeatherForecast weatherForecast
                = new OrgImplementation(weatherService, "torun");
        WeatherForecast weatherForecast1
                = new FasterImplementation(weatherService, "torun");

        System.out.println(weatherForecast.getWeather());
        System.out.println(weatherForecast1.getWeather());

//        Current current = weatherService.getCityWeather("Zamosc"); // nie uzywac polskich znakow oraz chyba nie dziala dla Warszawy i Lublina
//        System.out.println("TEMPERATURA: " + current.getTemp_c() + " St.C");
//        System.out.println("Zachmurzenie: " + current.getCloud() + " % nieba");
//        System.out.println("Samopoczucie : " + current.getFeelslike_c());
//        System.out.println("Wilgotność : " + current.getHumidity() + " % ");
//        System.out.println("PORA: dzień 1 | noc 0: " + current.getIs_day());
//        System.out.println("Ciśnienie : " + current.getPressure_in() + " hPa");
//        System.out.print("Siła wiatru: " + current.getWind_kph() + " km/h" +
//                " w porywach do : " + current.getGust_kph() + " km/h");
    }
}

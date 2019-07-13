package pl.sda;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sda.model.Current;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.SQLOutput;

public class WeatherService {

    private String url;
    private String finalUrl;
    private String key;


    public WeatherService(String url, String key) {
        this.url = url;
        this.key = key;
        this.finalUrl = this.url + "?key=" + key + "&q=";

    }

    public Current getCityWeather(String city) {
        this.finalUrl = this.finalUrl + city;
        System.out.println(this.finalUrl);
        Current current = new Current();
        try {
            String data = IOUtils.toString(new URL(this.finalUrl),
                    Charset.forName("UTF-8"));
            JSONObject jsonObject = new JSONObject(data);
            System.out.println(data);

            String temp = jsonObject.getJSONObject("current").get("temp_c").toString();
            System.out.println(temp);


            current.setTemp_c(Double.parseDouble(temp));




        } catch (IOException e) {
            e.printStackTrace();
        }
        return current;

    }

//    WeatherService weatherService = new WeatherService(
//            "http://api.apixu.com/v1/current.json",
//            "8378abafd53249d8bfa81431191307"


}

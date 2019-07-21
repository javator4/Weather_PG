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
    private String key;
    private String finalUrl;
    private String data = "";


    public WeatherService(String url, String key) {
        this.url = url;
        this.key = key;
        this.finalUrl = this.url + "?key=" + key + "&q=";
    }

    public String getJSONData(String city) {
        if (this.data.isEmpty()) {
            this.finalUrl = this.finalUrl + city;
            System.out.println("WYWOLANIE");
            try {
                this.data = IOUtils.toString(new URL(this.finalUrl),
                        Charset.forName("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}



// poniżej pierwsza wersja działająca
//    public Current getCityWeather(String city) {
//        this.finalUrl = this.finalUrl + city;
//        System.out.println(this.finalUrl);
//        Current current = null;
//        try {
//            String data = IOUtils.toString(new URL(this.finalUrl),
//                    Charset.forName("UTF-8"));
//            JSONObject jsonObject = new JSONObject(data);
//            System.out.println(data);
//
//            String temp = jsonObject.getJSONObject("current").get("temp_c").toString();
//            // System.out.println(temp);
//            //  current.setTemp_c(Double.parseDouble(temp));
//
//            String chmury = jsonObject.getJSONObject("current").get("cloud").toString();
////            System.out.println(chmury);
////            current.setCloud(Integer.parseInt(chmury));
//
//            String biomet = jsonObject.getJSONObject("current").get("feelslike_c").toString();
////            System.out.println(biomet);
//            //          current.setFeelslike_c(Float.parseFloat(biomet));
//
//            String wilgoc = jsonObject.getJSONObject("current").get("humidity").toString();
////            System.out.println(wilgoc);
//            //          current.setHumidity(Integer.parseInt(wilgoc));
////
//            String poraDnia = jsonObject.getJSONObject("current").get("is_day").toString();
////            System.out.println(poraDnia);
//            //     current.setIs_day(Integer.parseInt(poraDnia));
//
//            String hPa = jsonObject.getJSONObject("current").get("pressure_in").toString();
////            System.out.println(hPa);
////
//            String wiatr = jsonObject.getJSONObject("current").get("wind_kph").toString();
////            System.out.println(wiatr);
//            //        current.setWind_kph(Float.parseFloat(wiatr));
//
//
//            String wiatrWporywachDo = jsonObject.getJSONObject("current").get("gust_kph").toString();
////            System.out.println(wiatrWporywachDo);
//            //          current.setGust_kph(Float.parseFloat(wiatrWporywachDo));
//
//            current = Current.builder()
//                    .temp_c(Double.parseDouble(temp))
//                    .cloud(Integer.parseInt(chmury))
//                    .feelslike_c(Float.parseFloat(biomet))
//                    .gust_kph(Float.parseFloat(wiatrWporywachDo))
//                    .pressure_in(Float.parseFloat(hPa))
//                    .wind_kph(Float.parseFloat(wiatr))
//                    .humidity(Integer.parseInt(wilgoc))
//                    .build();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return current;
//    }

//    WeatherService weatherService = new WeatherService(
//            "http://api.apixu.com/v1/current.json",
//            "8378abafd53249d8bfa81431191307"




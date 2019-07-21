package pl.sda;

import lombok.Data;
import org.json.JSONObject;
import pl.sda.model.Current;
import pl.sda.model.Location;
import pl.sda.model.Weather;
@Data
public class JsonDataOrg extends AbstractJsonData{

   private String city;

    @Override
    Weather getWeather() {
        JSONObject jsonObject = new JSONObject(this.getJSONData(this.city));
        String temp = jsonObject.getJSONObject("current")
                .get("temp_c").toString();
        String lat = jsonObject.getJSONObject("location").get("lat").toString();
        String lon = jsonObject.getJSONObject("location").get("lon").toString();
        String country = jsonObject.getJSONObject("location").get("country").toString();
        String name = jsonObject.getJSONObject("location").get("name").toString();

        Weather weather = new Weather();

        Current current =  Current.builder()
                .temp_c(Double.parseDouble(temp))
                .build();

        Location location =  Location.builder()
                .lat(Float.parseFloat(lat))
                .lon(Float.parseFloat(lon))
                .country(country)
                .name(name)
                .build();

        weather.setCurrent(current);
        weather.setLocation(location);

        return weather;


    }
}

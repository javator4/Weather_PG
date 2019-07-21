package pl.sda;


import lombok.Data;
import org.apache.commons.io.IOUtils;
import pl.sda.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
@Data
public abstract class AbstractJsonData {

    private String url = "http://api.apixu.com/v1/current.json";
    private String key = "8378abafd53249d8bfa81431191307";
    private String finalUrl;

    private String data = "";

public AbstractJsonData(){
    this.finalUrl = this.url + "?key=" + key + "&q=";
}

public void build(){

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

        abstract Weather getWeather();

}

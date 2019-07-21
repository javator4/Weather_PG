package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class  Current {

    private int last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;

    private float wind_mph;
    private float wind_kph;
    private int wind_degree;
    private String wind_dir;
    private int pressure_mb;
    private float pressure_in;
    private int precip_mm;
    private int precip_in;
    private int humidity;
    private int cloud;
    private float feelslike_c;
    private float feelslike_f;
    private int vis_km;
    private int vis_miles;
    private int uv;
    private float gust_mph;
    private float gust_kph;
    private Condition condition;
}

//            "last_updated_epoch": 1563012024,
//                    "last_updated": "2019-07-13 12:00",
//                    "temp_c": 22,
//                    "temp_f": 71.6,
//                    "is_day": 1,
//"current": {
//        "last_updated_epoch": 1563012024,
//                "last_updated": "2019-07-13 12:00",
//                "temp_c": 22,
//                "temp_f": 71.6,
//                "is_day": 1,
//                "condition": {
//            "text": "Partly cloudy",
//                    "icon": "//cdn.apixu.com/weather/64x64/day/116.png",
//                    "code": 1003
//        },
//        "wind_mph": 9.4,
//                "wind_kph": 15.1,
//                "wind_degree": 20,
//                "wind_dir": "NNE",
//                "pressure_mb": 1021,
//                "pressure_in": 30.6,
//                "precip_mm": 0,
//                "precip_in": 0,
//                "humidity": 61,
//                "cloud": 25,
//                "feelslike_c": 24.6,
//                "feelslike_f": 76.2,
//                "vis_km": 10,
//                "vis_miles": 6,
//                "uv": 6,
//                "gust_mph": 10.5,
//                "gust_kph": 16.9


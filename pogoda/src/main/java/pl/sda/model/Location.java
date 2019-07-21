package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location {


    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tz_id;
    private int localtime_epoch;
    private String localtime;
//
//    "location": {
//        "name": "Paris",
//                "region": "Ile-de-France",
//                "country": "France",
//                "lat": 48.87,
//                "lon": 2.33,
//                "tz_id": "Europe/Paris",
//                "localtime_epoch": 1563013180,
//                "localtime": "2019-07-13 12:19"

}

package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condition {


    private String text;
    private String icon;
    private int code;

//
//                    "condition": {
//        "text": "Partly cloudy",
//                "icon": "//cdn.apixu.com/weather/64x64/day/116.png",
//                "code": 1003
}

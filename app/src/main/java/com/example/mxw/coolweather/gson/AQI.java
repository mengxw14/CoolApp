package com.example.mxw.coolweather.gson;

/**
 * Created by MXW on 2020/3/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

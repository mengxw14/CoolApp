package com.example.mxw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MXW on 2020/3/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

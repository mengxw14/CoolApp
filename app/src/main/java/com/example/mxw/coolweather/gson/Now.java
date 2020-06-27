package com.example.mxw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MXW on 2020/3/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

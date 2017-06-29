package com.example.wxagchen.helloweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：江南大学-陈爱国 on 2017/6/28 10:08
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

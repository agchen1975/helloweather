package com.example.wxagchen.helloweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：江南大学-陈爱国 on 2017/6/28 10:05
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}

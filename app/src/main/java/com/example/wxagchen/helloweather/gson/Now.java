package com.example.wxagchen.helloweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：江南大学-陈爱国 on 2017/6/28 10:03
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
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

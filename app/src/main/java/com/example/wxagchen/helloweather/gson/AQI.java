package com.example.wxagchen.helloweather.gson;

/**
 * 作者：江南大学-陈爱国 on 2017/6/28 10:01
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}

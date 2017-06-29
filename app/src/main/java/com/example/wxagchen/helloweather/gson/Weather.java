package com.example.wxagchen.helloweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：江南大学-陈爱国 on 2017/6/28 10:10
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

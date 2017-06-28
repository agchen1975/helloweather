package com.example.wxagchen.helloweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 作者：江南大学-陈爱国 on 2017/6/27 10:14
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

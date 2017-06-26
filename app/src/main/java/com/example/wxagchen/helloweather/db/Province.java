package com.example.wxagchen.helloweather.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：江南大学-陈爱国 on 2017/6/26 14:56
 * 微信：agchen1975
 * QQ号：86730125
 * 功能：
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

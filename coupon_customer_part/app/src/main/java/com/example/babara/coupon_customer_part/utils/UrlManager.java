package com.example.babara.coupon_customer_part.utils;

/**
 * Created by Babara Liang on 2017/1/17.
 * Description:该类的作用是管理服务器的地址
 * 实际是用此方法实现一个全局变量
 */

public class UrlManager {
    public static String createUrlString(String addString){
        return "http://192.168.1.157:8080/coupon"+ addString;
    }
}
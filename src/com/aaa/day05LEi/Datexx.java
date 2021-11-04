package com.aaa.day05LEi;

import java.time.Duration;
import java.time.LocalDateTime;
/*
*
* */
public class Datexx {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();//时间处理类，返回日期时间
        LocalDateTime pa=LocalDateTime.parse("2011-08-08T17:10:16.355");//
        Duration dt =Duration.between(pa,ldt);
        System.out.println(dt.toDays());//间隔天数toDays
        System.out.println(dt.toHours());//间隔小数toHours
        System.out.println(dt.toMillis());//间隔分钟toMillis
        System.out.println(dt.getSeconds());//间隔毫秒getSeconds


    }
}

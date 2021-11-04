package com.aaa.day05LEi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datex {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();//返回日期 2021-08-07
        System.out.println(now);

        LocalDateTime now1=LocalDateTime.now();//返回日期时间2021-08-07T09:35:03.810
        System.out.println(now1);

        LocalTime now2=LocalTime.now();//返回时间09:35:03.810
        System.out.println(now2);

        DateTimeFormatter now3=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String aa=now.format(now3);//将日期转化成字符串  在用format分析这个这个格式2021/08/07

        //Period p= Period.between();

        System.out.println(aa);

        String str ="2021/10/16";
        DateTimeFormatter dat=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date=LocalDate.parse(str,dat);
        System.out.println(date);//2021-10-16  将字符串转化成Date类型



    }
}

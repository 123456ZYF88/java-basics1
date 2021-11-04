package com.aaa.day05LEi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datea {

    public static void main(String[] args) throws ParseException {
        Date date =new  Date(); //当前的国际时间
        System.out.println(date);
        System.out.println(date.getTime()); //getTime  获取毫米级的秒数
        System.out.println(date.getHours());//Hours 获取时间

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间

        String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
        System.out.println(s);
        //将中国通用格式String---》Date类型
        String str = "2020-11-13 星期五 11:40:24";//自己设置一个时间格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        //parse方法将字符串转换成Date形式的
        Date a=sdf1.parse(str);
        System.out.println(a);
        String b=sdf1.format(a);
        System.out.println(b);
        // 格式 new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");
        //  显示格式    2021-8-6  16:36  2021-8-6 16:36
        //yyyy---> 年
        //MM--->  月
        //dd --> 日
        //HH --> 24小时制
        //hh--> 12小时制
        //mm --> 分钟
        //ss -->秒
        //EEE -->星期
        //W --> 一月中的第几周
        //w--> 一年中的第几周
       /* Date date =new Date();
        System.out.println(date);
        SimpleDateFormat sm1=new SimpleDateFormat("yyy/MM/dd W w EEE hh:mm:ss");
        String ss=sm1.format(date);//format 格式
        System.out.println(ss);*/


    }
}

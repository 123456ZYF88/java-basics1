package com.aaa.day01;

import java.util.Scanner;

public class ShiYan_3 {
    public static void ain (String [] args){



        //引用数据类型：首字母一般都是大·写   数组也是引用数据类型   就是累
        String str="这是一个字符串";

        Scanner sca =new Scanner(System.in);

        //类型转换
        //一个体系可以转 int byte short long double float char 想同类型的可以转换
        //char 的字符是ASCII吗  所有字符都有对应的数字 也是数字类型
        //不同体系的不能转换
        //基本数据类型和引用数据类型，不能类型转换
        byte byte1=1;
        int int1=byte1;//范围小的给范围大的赋值时可以直接转   小转大直接 安全 不会溢出

        //byte byte2=int1;//范围大的给范围小的，就有风险  有可能大的里面内容多小的放不下就溢出了  所也编译器不然这样转
        byte bytr2=(byte)int1;//但是可以强转  强转有风险 多的水就溢出了

        int int2 =35000000;  //int short32000
        short sh = (short) int2;//大给小   大的内容太多  接不住就丢失了
        System.out.println(sh);

        //小给大直接给， 大给小强转给 有风险 数据丢失
        //
        int a=1;
        short b=2;
        int d=a+b;//混合运算往大走  byte  short的混合运算----int


        byte bb=1;//数字常量按照int进行处理

        float ff=5.5f;//浮点型常量按照double处理
        double dd=ff;

    }
}

package com.aaa.day01;

import java.util.Scanner;

public class ShiYan_1 {
    public static void main (String []args){
     int agb;
       agb =10;
       int a = 10,b=10,c=9;
       System.out.print(a);

       int  int1=111111111;
       //long long1=11111111111111111;int超长了 long也输入不进去
        //直接书写的数值是：整形常量（）默认int的
       long long1=11111111111111111L;//加一个L带表他是长整形

        double doble1=1.1;
        //浮点型是double 的类型  double 占8个字节  float占4个字节
        float float1=1.1f; //f代表他是一个浮点型常量值
        // ''代表字符 ""代表字符串
        char cha='是';
       /*变量的定义
        * js： var/let 变量名--undefuned
        * 变量名=变量值；
        * 弱类型：数据变量名决定不了数据类型，
        * java：
        *   强变量：变量声明的时候我一定制定了数据类型
        *   赋值只能在这个范围内赋值
        * 数据类型  变量名
        *
        * 变量名=变量值//变量名才能用
        * 数据类型  变量名=变量值
       *  数据类型  名1=1，名2=2，名3,=3; 分号一定注意         菜鸟
       *
       * 标识符
       *    大体和js类似
       *    1、字母加 _ $开头  后边：字母 数字 _ 和$
       *    2.不能不能空格
       *    3,。不能是关键字
       *    软性
       *    1、知名知义
       *    2、变量名 小驼峰
       *    3、类名 大驼峰
       *    4、常量命名 全大写 ZHANG_YI_FAN 加下划线
       *
       *数据类型
       *    js
       *    typeof数据类型
       *    number string boolean undefined null object
       *    java的数据类型：更细化
       *
       * */
        int age;
        age=11;
        System.out.print(age);
        int age1=11;
        //输入个数 鸡头1  鸡爪3块  求总价
 /*       System.out.println("你吃啦多少个鸡头");
        Scanner sc = new Scanner(System.in);
        int tNum=sc.nextInt();

        System.out.println("你吃几个鸡爪");
        Scanner sc1=new Scanner(System.in);
        int zNum= sc1.nextInt();
        System.out.println("你吃了"+(tNum*1+zNum*3)+"元");*/
    }
}

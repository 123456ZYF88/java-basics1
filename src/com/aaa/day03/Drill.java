package com.aaa.day03;

public class Drill {

//
    String name;
    final  String TEACHER_NAME;
    public Drill(String teachername) {
        TEACHER_NAME  =teachername;//给所有得成员变量做初始化赋值：引用为null   数字为0  Boolean为false
    }

    public static void main(String[] args) {


  /*      Drill sc=new Drill(13,45);
        //sc.A=34;new的时候已经赋值啦
        System.out.println(sc.A);*/
        int age=11;
        age=12;
         final double PAI=3.1415926;
        //PAI=11;
         final String TECHER_NAME;
         TECHER_NAME="米开朗基罗";

         final Drill ss=new Drill("迪纳塔莱");
         final  Drill sc=new Drill("阿发斯蒂芬");
         ss.name="撒个维吾尔";
        System.out.println(ss.name+"----"+ss.TEACHER_NAME+"---"+sc.TEACHER_NAME);
    }
}

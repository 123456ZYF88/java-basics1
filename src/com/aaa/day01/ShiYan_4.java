package com.aaa.day01;

import java.util.Scanner;

public class ShiYan_4 {
    public static void main (String []args){
        //Scanner 是系统提供的一个类 所有类的使用基本都需要进行 new
        //Scanner是引用类
        //Scanner和你的类不在一起 所有需要导入使用
        Scanner sc=new Scanner(System.in);
        Scanner luru=new Scanner(System.in);
        String str=luru.next();//录入字符串--程序会等待：等待用户做录入
        System.out.println(str);
        int int1=luru.nextInt();//录入数字
        System.out.println(int1);
        double dobule1=luru.nextDouble();//录入浮点
        System.out.println(dobule1);
    }
}

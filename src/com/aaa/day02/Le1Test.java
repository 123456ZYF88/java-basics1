package com.aaa.day02;

import java.util.Scanner;

public class Le1Test {
    public static void main (String []args){
      /*  Le1 wyf=new Le1();
        wyf.name="吴亦凡";
        wyf.nn="加拿大";
        wyf.age=30;
        wyf.prison=30;
        // wyf.eat();
        String str=wyf.eat();
        System.out.println(str);*/

        System.out.println("请输入两个数 得出最大值和 两个数的和");
        Le1 js=new Le1();
        Scanner sc1=new Scanner(System.in);
        int a= sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        int b= sc2.nextInt();
        int  Max=js.max(a,b);
        int Sum= js.sum(a,b);
        System.out.println("和是："+Sum+",最大："+Max);
    }
}

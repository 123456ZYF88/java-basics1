package com.aaa.day05LEi;

import java.util.Scanner;

public class Enter {
    /*
    录入用户名  密码
    判断用户名密码是admin amdin
    如果是提示登录成功，然后录入今天的作业题目
    如果作业题目是以.java结尾的那么作业提交成功否则失败
    * */
    public static void main(String[] args) {
        // 录入用户名  密码
        System.out.print("输入用户名：");
        Scanner sc1=new Scanner(System.in);
        String a= sc1.next();
        System.out.print("输入密码：");
        Scanner sc2=new Scanner(System.in);
        String b= sc2.next();
        String c="admin";
        String d="amdin";
        if(c.equals(a) && b.equals(d) ){
            System.out.println("登录成功，请录入作业");
            //格式密码都满足的话执行下面
            Scanner sc3=new Scanner(System.in);
            String e= sc3.next();
            //判断作业是否是以.java结尾的  返回一个boolea值
            //为true  格式正确提交成功   为false 提示格式错误提交失败
            boolean x=e.endsWith(".java");
            if(x==true){
                System.out.println("提交成功");
            }else{
                System.out.println("作业格式错误 提交失败");
            }
        }else{
            System.out.println("用户名或者密码错误");
        }

    }
}

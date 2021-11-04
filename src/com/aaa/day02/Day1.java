package com.aaa.day02;

import java.util.Scanner;

public class Day1 {
    public static void main (String[]args){
/*        int i=1;
    while (i<=180){
        System.out.println("早上8.00起床");
        System.out.println("早上8.10吃饭");
        System.out.println("中午12.00下课");
        System.out.println("晚上9.30下课");
        i++;
    }*///基础while循环

/* 考试成绩
        System.out.println("请输入成绩");
        Scanner sc=new Scanner(System.in);
        int score= sc.nextInt();


if(score>=90){
            System.out.println("优");

        }else{
            if(score>=80){
                System.out.print("良好");
            }else{
                if(score>=60){
                    System.out.println("及格");
                }else {
                    System.out.println("不及格");
                }
            }
        }

        if(score>=90){
            System.out.println("优");

        }else if(score>=80){
            System.out.print("良好");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        *///考试成绩
        //令狐冲问：盈盈满意吗？如果不满意，早上8.00跳舞，下午2.00唱歌 ，晚上9.00rap，如果满意：参加演出
/*
判断条件   盈盈满意吗？
执行的代码块
    早上8.00跳舞，下午2.00唱歌 ，晚上9.00rap
 */
            System.out.println("盈盈满意吗");
            Scanner sc=new Scanner(System.in);
            String str= sc.next();
            while (str.equals("不满意")){//equals 用了比较字符串类型的值 ==比较的是基本数据类型的值
                System.out.println("早上8.00跳舞");
                System.out.println("下午2.00唱歌");
                System.out.println("晚上9.00rap");

                System.out.println("盈盈满意？");
                str=sc.next();
            }
        System.out.println("参加演出");

    }
}

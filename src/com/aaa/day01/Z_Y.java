package com.aaa.day01;

import java.util.Scanner;

public class Z_Y {
    public static void main(String [] args){
      //  1.输入一个3位数，输出个位  十位  百位的内容
        /* System.out.println("请输入一个3位数");
        Scanner s3=new Scanner(System.in);
        int a= s3.nextInt();
        int b=a/100;
        System.out.println("百位数"+b);
        int c=a%100/10;
        System.out.println("十位数"+c);
        int d=a%10;
        System.out.println("个位数"+d);*/
        //水仙花
       /* System.out.println("请输入一个数");
        Scanner s3=new Scanner(System.in);
        int a= s3.nextInt();
        int g=a%10;//g个为位数
        int sei=a%100/10;//十位
        int b=a/100;//百
        if(g*g*g+sei*sei*sei+b*b*b==a){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/

       // 2.同学聚会，进行点菜，点了大盘鸡 水煮鱼  大虾 以及4个凉菜  1箱啤酒  分别录入各个单价，
        // 并计算总价，录入总学生数，计算人均多少钱
      /*  System.out.println("大盘鸡");
        Scanner c1=new Scanner(System.in);
        int a= c1.nextInt();
        System.out.println("水煮鱼");
        Scanner c2=new Scanner(System.in);
        int b= c2.nextInt();
        System.out.println("虾");
        Scanner c3=new Scanner(System.in);
        int c= c3.nextInt();
        System.out.println("凉菜");
        Scanner c4=new Scanner(System.in);
        int d= c4.nextInt();
        System.out.println("啤酒");
        Scanner c5=new Scanner(System.in);
        int e= c1.nextInt();
        System.out.println("几个学生");
        Scanner c6=new Scanner(System.in);
        int f= c6.nextInt();
        int sum,scure;
        e*=4;
        sum=a+b+c+d+e;
        scure=sum/f;
        System.out.println("一共"+sum+"元"+"平均"+scure);*/

       //4. 输入两个数比如4和6，然后在输入一个数比如10，判断这个数是不是这两个数的公倍数——输出true false即可
       /* System.out.println("输入三个数");
        Scanner c1=new Scanner(System.in);
        int a= c1.nextInt();
        Scanner c2=new Scanner(System.in);
        int b= c2.nextInt();
        Scanner c3=new Scanner(System.in);
        int c=c3.nextInt();
        if(c%a==0 && c%a==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/

       // 5. 输入两个数比如4和6，然后再输入一个数比如2，判断这个数是不是这两个数的公约数——输出true fasle即可
      /*  System.out.println("输入三个数");
        Scanner c1=new Scanner(System.in);
        int a= c1.nextInt();
        Scanner c2=new Scanner(System.in);
        int b= c2.nextInt();
        Scanner c3=new Scanner(System.in);
        int c=c3.nextInt();
        if(a%c==0 && b%c==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/


       // 6. 连续录入五个人的成绩，计算最大成绩  最小成绩（明天的作业）和平均成绩
        System.out.println("输入五个人的成绩");
        Scanner c1=new Scanner(System.in);
        int a= c1.nextInt();

        Scanner c2=new Scanner(System.in);
        int b= c2.nextInt();
        Scanner c3=new Scanner(System.in);
        int c= c3.nextInt();

        Scanner c4=new Scanner(System.in);
        int d= c4.nextInt();
        Scanner c5=new Scanner(System.in);
        int e=c5.nextInt();
        int max,min,sum;
        max=a<b ? b:a;
        max=max>c ? max:c;
        max=max>d ?  max:d;
        max=max>e ? max:e;

        min=a>b ? b:a;
        min=min<c ? min:c;
        min=min<d ?  min:d;
        min=min<e ? min:e;

        sum= (a+b+c+d+e)/5;
        System.out.print("最大="+max+"最小=="+min+"平均=="+sum);
    }
}

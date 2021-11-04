package com.aaa.day03;

import java.util.Scanner;

public class Cat {
  /*  声明一个Cat类，含有属性name和静态属性total（总饭量）
    书写构造方法初始化赋值书写eat(接受饭量)
    {输出吃了多少，如果总饭量到了100就不能在吃了，返回false即可}main：new多个小猫，去吃东西，当吃够100代表没饭了，大家都不能在吃了*/
    String name;
    static int total;
    public  boolean Cat(int eat ){
        total+=eat;
        boolean a=true;
            if(total>100){//如果总饭量到了100就不能在吃了
                System.out.println("大家不能在吃了");
                a=false;
            }else{
                System.out.println(name+"吃了"+(eat));//输出吃了多少
                if(total==100){
                    System.out.println("大家不能在吃了");
                    a=false;
                }
            }
           return a;
    }

    public static void main(String[] args) {

        Cat xb = new Cat();
        xb.name = "小白";
        Cat xh = new Cat();
        xh.name = "小黑";
        Cat hz = new Cat();
        hz.name = "黑子";

        while (total<100) {
            if(total<100){
                System.out.println("小白吃了多少");
                Scanner sc1 = new Scanner(System.in);
                int a = sc1.nextInt();
                xb.Cat(a);
            }
            if(total<100){
                System.out.println("小黑吃了多少");
                Scanner sc2 = new Scanner(System.in);
                int b = sc2.nextInt();
                xh.Cat(b);
            }
            if(total<100){
                System.out.println("黑子吃了多少");
                Scanner sc3 = new Scanner(System.in);
                int c = sc3.nextInt();
                hz.Cat(c);
            }

        }
    }
}

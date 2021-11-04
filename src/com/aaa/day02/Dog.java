package com.aaa.day02;

public class Dog {
    //属性：共有特征的提取
    String name;
    String color;
    String breed;
    //方法就是共有行为的提取
    void jbxx(){
        System.out.println("名字："+name+"颜色："+"品种："+breed);
    }
    /*接收参数  food就是一个形式参数   形参
    他的值谁调用谁决定
    (参数列表： 数据类型 变量名 ，数据类型 变量名)
    * */
    String cc(String food,String yingliao){
        System.out.println(name+"吃"+food+"，喝"+yingliao);

        //return 返回值 必须定义数据类型   void 代表没有返回值
        return  "吃饱了";//将结果给变量者
    }
    void kj(){
        System.out.println(name+"在看家");
    }


    public static void main (String []args){
        Dog xg=new Dog();
        xg.name="小黑";
        xg.color="黑色";
        xg.breed="中华田园犬";
        xg.jbxx();
        xg.cc("鸡头","白开水");
        xg.kj();
        String str=xg.cc("鸡头","白开水");
        System.out.println(str);

    }
}

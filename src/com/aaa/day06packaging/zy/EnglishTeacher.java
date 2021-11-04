package com.aaa.day06packaging.zy;

public class EnglishTeacher extends Teacher{//定义一个英语教师类EnglishTeacher,继承于教师类；

    public EnglishTeacher() {//无参构造函数）定义无参构造函数

    }
    public EnglishTeacher(String name){//再写一个带参数的构成函数EnglishTeacher（String name）并显式调用父类的带参构造方法
        super.name=name;
    }
    @Override//重写父类的teach();输出我是从事英语教学的。
    void teach() {
        System.out.println("我是教英语的");
    }
    void write(){

    }
    //有两个重载方法，write（），write（String scource）;
    void write(String scource){

    }

    public static void main(String[] args) {
        EnglishTeacher e1=new EnglishTeacher("孙悟空");
        System.out.println("我的名字叫"+e1.name);

    }
}

package com.aaa.day06packaging.zy;

import com.sun.org.apache.xalan.internal.xslt.Process;

public class MathTeacher extends Teacher{//定义一个数学教师类MathTeacher,继承于教师类；

    @Override
    void teach() {
        System.out.println("我是教数学的");//重写父类的teach();输出我是从事数学教学的。
    }

    public MathTeacher() {
    }
    //定义无参构造函数。再写一个带参数的构成函数MathTeacher（String name）
    public MathTeacher(String name) {

    }
    void ready(){

    }
    //有两个重载方法，ready（），ready（String scource）;
    void ready(String scoure){//重载

    }

    public static void main(String[] args) {
        MathTeacher M1=new MathTeacher();

    }

}

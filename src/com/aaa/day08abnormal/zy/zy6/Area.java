package com.aaa.day08abnormal.zy.zy6;

class ycException extends RuntimeException{
    public ycException(String a) {
        super(a);
    }
}
/*
* 6.	计算圆的面积，半径不能为零和负数：
a)	封装一个类，类中写一个计算圆的面积的方法，传一个半径，返回面积，如果接受的半径<=0抛出异常
* */
public class Area {
    public double Area(double a) {
        if (a<=0){
            throw new ycException("半径<=0抛出异常");
        }
        return  3.14*a*a;
    }

    /*    double js(double a){
        if (a<=0){
            throw new ycException("半径<=0抛出异常");
        }
        return  3.14*a*a;
    }*/
}

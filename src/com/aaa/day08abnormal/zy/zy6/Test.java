package com.aaa.day08abnormal.zy.zy6;

import com.aaa.day07Mixins.zy3.Jss;

public class Test {
    public static void main(String[] args) {
        Area a= new Area();
    try{
        double b=a.Area(-1);
        System.out.println(b);
    }catch (ycException e){
        e.printStackTrace();
    }
    System.out.println("sdfsa");
    }
}

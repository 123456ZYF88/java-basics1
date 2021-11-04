package com.aaa.day07Mixins.zy3;

public class JsTEst {
    public static void main(String[] args) {
        Add jsTEst=new Add();

        System.out.println( jsTEst.jisuan(50,50));
        Subtract subtract=new Subtract();

        System.out.println(subtract.jisuan(60,50));
    }
}

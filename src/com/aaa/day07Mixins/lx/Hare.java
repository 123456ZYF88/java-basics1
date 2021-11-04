package com.aaa.day07Mixins.lx;

public class Hare extends Animal{
    @Override
    public void eat() {
        //注意前提条件是继承和方法的重写
        System.out.println("兔子吃草");
    }
}

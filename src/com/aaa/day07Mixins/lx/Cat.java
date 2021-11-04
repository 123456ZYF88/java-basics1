package com.aaa.day07Mixins.lx;

public class Cat extends Animal{

   //注意前提条件是继承和方法的重写
    String name="猫";
    @Override
    public void eat() {
        System.out.println(name+"吃鱼");
    }
}

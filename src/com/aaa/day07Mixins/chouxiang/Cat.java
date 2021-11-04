package com.aaa.day07Mixins.chouxiang;

import com.aaa.day07Mixins.lx.Animal;

public class Cat extends Animal {
   /* public void feed(){
        System.out.println("小猫吃");
    }*/
    String name="猫";
    @Override
    public void eat() {
        System.out.println(name+"吃鱼");
    }
}

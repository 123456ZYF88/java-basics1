package com.aaa.day07Mixins.zy1;

public class Piano extends Instrument{
    public Piano() {
    }

    @Override
    public void makeSound() {
        System.out.println("弹钢琴");
    }
}

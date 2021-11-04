package com.aaa.day07Mixins.zy1;

public class Violin extends  Instrument{
    public Violin() {
    }

    @Override
    public void makeSound() {
        System.out.println("拉小提琴");
    }
}

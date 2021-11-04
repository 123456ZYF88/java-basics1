package com.aaa.day07Mixins.zy4;

public class Colours implements Printer{
    @Override
    public void print(String info) {
        System.out.println("打印彩色的"+info);
    }
}

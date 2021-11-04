package com.aaa.day07Mixins.zy4;

public class Black implements Printer{
    @Override
    public void print(String info) {
        System.out.println("打印黑白的"+info);
    }
}

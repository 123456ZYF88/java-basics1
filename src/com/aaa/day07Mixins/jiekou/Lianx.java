package com.aaa.day07Mixins.jiekou;

public class Lianx implements Computer{

    @Override
    public void usb() {
        System.out.println("3.0的usb4个");
    }

    @Override
    public void kg() {
        System.out.println("LIANX");
    }

    @Override
    public void zhuban() {
        System.out.println("lxzhuban");
    }

    @Override
    public void cpu() {
        System.out.println("lianx:cpu");
    }
}

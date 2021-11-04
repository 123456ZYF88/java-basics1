package com.aaa.day07Mixins.jiekou;

public class PingGuo implements Computer{

    @Override
    public void usb() {
        System.out.println("pign:usb");
    }

    @Override
    public void kg() {
        System.out.println("ping:kg");
    }

    @Override
    public void zhuban() {
        System.out.println("ping:zhuban");
    }

    @Override
    public void cpu() {
        System.out.println("ping:cpu");
    }
}

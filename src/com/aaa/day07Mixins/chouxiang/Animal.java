package com.aaa.day07Mixins.chouxiang;

public abstract class Animal {//抽象类

    public void Animal(){

    }
        String name;
        //抽象方法----多态服务---父类中如果没有这个方法的定义，父类不能调用
        public abstract void eat();
}

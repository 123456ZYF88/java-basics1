package com.aaa.day06packaging.kqc;

import com.aaa.day06packaging.zy2.Aardvark;

public class Lion extends Animal {
    //再编写一个main()函数，创建Lion和Aardvark对象（"Leo"，400磅；"Algernon"，50磅）。为派生类对象调用who()成员，说明who()成员在两个派生类中是继承得来的。
    public static void main(String[] args) {
        Lion Aardvark=new Lion();
        Aardvark.setName("Algernon");
        Aardvark.setWeight(50);
        Aardvark.who();
    }
}

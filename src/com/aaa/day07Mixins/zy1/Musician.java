package com.aaa.day07Mixins.zy1;

public class Musician {
    public void play(Instrument i){
        i.makeSound();
    }

    public static void main(String[] args) {//4)定义测试类，给乐手不同的乐器让他弹奏
            Musician m1=new Musician();
            Erhu erhu=new Erhu();
            m1.play(erhu);//啦二胡
            Piano piano=new Piano();
            m1.play(piano);//弹钢琴
            Violin violin=new Violin();
            m1.play(violin);//拉小提琴
    }
}

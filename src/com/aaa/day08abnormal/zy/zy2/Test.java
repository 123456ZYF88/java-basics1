package com.aaa.day08abnormal.zy.zy2;

class hei implements Dy{
    @Override
    public void print(String info) {
        System.out.println("打印彩色的"+info);
    }
}
class  cai implements Dy{

    @Override
    public void print(String info) {
        System.out.println("打印黑白的"+info);
    }
}
public class Test {
    private Dy a;
    void play(String info){
        a.print(info);
    }

    public Dy getA() {
        return a;
    }

    public void setA(Dy a) {
        this.a = a;
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.setA(new cai());
        test.play("身份证");
    }
}

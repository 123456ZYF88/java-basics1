package com.aaa.day07Mixins.jiekou;

public class DyjTest {

    private  Dyj com;

    public void ddy(){
        com.dy();
    }
    public Dyj getCom() {
        return com;
    }
    //get  set  进行赋值取值  new一个这个借口的对象
    public void setCom(Dyj com) {
        this.com = com;
    }

    public static void main(String[] args) {
        DyjTest dyjTest=new DyjTest();

        dyjTest.setCom(new Hei());//给这个接口赋值一个对象
        dyjTest.ddy();//这个对象在调用里面的方法ddy   他接口下的变量就想到于这个接口下的对象   然后调用这个接口下的方法
        dyjTest.setCom(new Cai());
        dyjTest.ddy();
    }
}

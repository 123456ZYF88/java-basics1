package com.aaa.day08abnormal.zy.zy4;

public class Test {
    /*
    * 4.运输公司接受订单，订单有货物重量和里程。 公司有3种运算工具：飞机  火车   卡车。
        a.	编写运输接口，含有一个计算运费的方法(参数是重量和历程)
        b.	3个实现类，
        卡车计算公司：重量*距离*120,，如果距离>1000  或者 重量<60 直接抛出异常
        火车：如果距离<=900 重量*距离*250, 如果距离>900   重量*距离*300
        飞机：如果距离>500  距离*重量*750   否则抛出异常拒绝载重
        c.	Main方法测试
*/
    private Carriage a;
    double play(double b,double c){
        return a.js(b,c);
    }
    public Carriage getA() {
        return a;
    }

    public void setA(Carriage a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test test =new Test();
        test.setA(new Truck());//声明飞机
        try{
            System.out.println("卡车运费是"+test.play(59,59));
        }catch (truckException e){
            e.printStackTrace();
        }
        test.setA(new Train());//声明火车
        System.out.println("火车"+test.play(59,59));

        try{
            test.setA(new Fj());
            System.out.println("飞机"+test.play(59,59));
        }catch (fjException e){
            e.printStackTrace();
        }
    }
}

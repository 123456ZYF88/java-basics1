package com.aaa.day08abnormal.zy.zy3;

import sun.swing.StringUIClientPropertyKey;

import java.util.Scanner;

class Television implements ComputWeight{

    @Override
    public double computeWeight() {
        return 40;//电视剧40
    }
}
class Computer implements ComputWeight{

    @Override
    public double computeWeight() {
        return 30;//计算机30
    }
}
class  WashMachine implements ComputWeight{
    @Override
    public double computeWeight() {
        return 60;//洗衣机60
    }
}

public class Truck {
    private ComputWeight a;
    double play(){
        return a.computeWeight();
    }
    public ComputWeight getA() {
        return a;
    }
    public void setA(ComputWeight a) {
        this.a = a;
    }
   double js(double a,double b,double c){
        double max=0;//计算一共的重量然后返回出去
        max+=a*new Television().computeWeight();//电视机40
       max+=b*new Computer().computeWeight();//计算机30
       max+=c*new WashMachine().computeWeight();//洗衣机60
       return max;
   }
    public static void main(String[] args) {
        double a=0;
        System.out.println("请输入电视机，计算机，洗衣机的数量");
        Scanner sc=new Scanner(System.in);
        Truck truck=new Truck();
        a=truck.js(sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
        System.out.println(a+"千克");

    }


}

package com.aaa.day08abnormal.zy.zy1;

public class Test {
        private  Computer a;
   public  void paly(){

        a.wsb();a.kg();
    }

    public Computer getA() {
        return a;
    }

    public void setA(Computer a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.setA(new Lianx());//联想电脑
        test.paly();
        test.setA(new Pg());
        test.paly();
    }
}

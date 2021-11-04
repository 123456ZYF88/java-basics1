package com.aaa.day07Mixins.jiekou;

public class MianTest {
    private Computer com;
    public void play(){
        com.kg();
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public static void main(String[] args) {

       /* Lianx lianx=new Lianx();//接口继承
        lianx.kg();
        lianx.cpu();
        Computer a=new Lianx(); //接口的多太
        a.cpu();
        Computer b=new PingGuo();
        b.cpu();*/
        MianTest mianTest=new MianTest();
        Lianx lianx=new Lianx();
        mianTest.setCom(lianx);
        mianTest.play();

        mianTest.setCom(new PingGuo());
        mianTest.play();
    }
}

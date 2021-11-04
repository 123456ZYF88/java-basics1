package com.aaa.day06packaging;

public class KongTiao {
    //private 私有，如果一个属性定义成私有的，那么外部就不能使用了  只能类使用
    //成员变量  私有化了
    private int wendu;
    //get 方法取值
    public int getWendu() {
        return wendu;
    }
    //set 方法赋值
    public void setWendu(int wendu) {
        if(wendu>31)wendu=31;
        if (wendu<16)wendu=16;

        this.wendu = wendu;
    }
}

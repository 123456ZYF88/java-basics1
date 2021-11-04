package com.aaa.day08abnormal.zy.zy4;

class truckException extends RuntimeException{
    public truckException(String yc) {
        super(yc);//卡车异常
    }
}
public class Truck implements Carriage{
    @Override
    public double js(double a, double b) {
        //卡车计算公司：重量*距离*120,，如果距离>1000  或者 重量<60 直接抛出异常
        if(a>1000 || b<60){
            throw new truckException("卡车距离大于1000 重量小于60拒载");
        }
        return  a*b*120;
    }

}

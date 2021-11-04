package com.aaa.day08abnormal.zy.zy4;

class fjException extends RuntimeException{
    public fjException(String d) {//飞机异常
        super(d);
    }
}
public class Fj implements Carriage{
    @Override
    public double js(double a, double b) {
        //飞机：如果距离>500  距离*重量*750   否则抛出异常拒绝载重
      /*  double c=0;
        if (b>500){
        c=a*b*750;
        }else{
            throw new fjException("飞机距离太短拒绝载重");
        }
        return c;*/
        if (b < 500) {
            throw new fjException("飞机距离太短拒绝载重");
        }
        return a*b*750;
    }
}

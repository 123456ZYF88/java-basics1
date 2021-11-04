package com.aaa.day08abnormal.zy.zy4;

public class Train implements Carriage{////火车
    @Override
    public double js(double a, double b) {
        double c=0;
        if(b<=900 ){//判断火车：如果距离<=900 重量*距离*250, 如果距离>900   重量*距离*300
            c=a*b*250;
            //return a*b*250;

        }else if(b>900){
            c=a*b*300;
        }//可以直接return a*b*300
        return c;
    }
}

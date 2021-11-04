package com.aaa.day03;

public class Test {
    //判断两个数是否相同
    public boolean fff(int a,int b){
    if(a==b){
        return true;
    }else{
        return false;
    }
}
    public static void main(String[] args) {
        Test sc=new Test();
        boolean c=  sc.fff(23,34);
        System.out.println(c);
    }
}

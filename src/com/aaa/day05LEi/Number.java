package com.aaa.day05LEi;

public class Number {
    //模拟拼接字符串 拼接从1到100000
    //计算机开始计时到   1970年1.1 00.00.00
    //使用string
    //测试string 和StringBuffer 和StringBuilder的速度 推荐使用StringBuffer
    public static void main(String[] args) {
        long start =System.currentTimeMillis();//返回当前时间的毫米数
        String  str="0";
        for(int i=1;i<=100000;i++){
                str+=i;
        }
       // System.out.println(str);
        long end=System.currentTimeMillis();
        System.out.println(end-start);//计算需要时间
        System.out.println("=========================");

        long start1=System.currentTimeMillis();//返回当前时间的毫米数
        StringBuffer buffer=new StringBuffer("0");
        for(int i=1;i<=100000;i++){
            buffer.append(i);
        }
        //System.out.println(buffer);
        long end1=System.currentTimeMillis();//返回当前时间的毫米数
        System.out.println(end1-start1);//计算需要时间

        long  start2=System.currentTimeMillis();
        StringBuilder builder=new StringBuilder();
        for(int i=1;i<=10000;i++){
            buffer.append(i);
        }
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);//计算需要时间

        //StringBuffer 和StringBuilder    因为线程安全问题StringBuffer比StringBuilder 慢一点但是安全一点
    }
}

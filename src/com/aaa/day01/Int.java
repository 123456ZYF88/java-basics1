package com.aaa.day01;

public class Int {
    //final int anInt;//final 在修饰成员变量的时候必须赋值，不赋值就直接报错  局部变量可以不付初始值 不会报错


    public void bbb(){

    }
    public static void main(String[] args) {
        final int i;


        int a=10;
        int b=010;//以0开头是八进制
        int c=0x10;//以0x开头的是16进制
        //如果计算输出是默认以10进制的
        System.out.println(a);//10
        System.out.println(b);//8
        System.out.println(c);//16

        //456是int类型的数据有4个字节
        //x变量声明的时候是long类型 占用8个字节
        /*456赋值给x的时候有类型转换
        int类型转换成long类型
        int小 long大  可以自动转换
        *
        * */
        long x=456;
        long y=2147483647;
        System.out.println(y);

        //long z=2147483648;//过大整数 错误  超出int类型了
        long z=2147483648l;//定义数字为long类型数字
        System.out.println(z);
        System.out.println("==========================");


        byte h=50;
        //byte给来特权  应该报错 但是没有报错
        //在java语言当中，一个整数面值没有超出byte类型取值范围的话，该面值可以直接赋值给byte变量
        byte h1=127;

        //byte h2=128; 报错

        /*计算机二进制有三种形式
        * 原码
        * 反码
        * 补码
        * 计算机在任何情况下低层表示和存储数据的时候采用啦补码形式
        * 正数的补码：和原码相同
        * 负数的补码： 负数的绝对值对应的二进制吗所有的二进制取反，在加一
        *
        * 补码：100000000
        * 原码计算过程
        *       1000000000 -1 ---》0111111111
        * 100000000----》128
        * -128
        * */
      byte m=(byte)198;
        System.out.println(m);//-58

        short s1=32767;//通过
        //short s2=32768;//不通过

        char cc=65535;
        //当一个整数字面值没有超过byte，short，char的取值范围，这个字面值可以直接放在给byte，short，char类型的变量
        //sun 公司为了方便程序员的编程 只要不超过数据类型的范围
        // 其实变量还是转换了不过是程序自动转换了

       // System.out.println();
    }
}

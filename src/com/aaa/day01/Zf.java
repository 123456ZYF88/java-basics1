package com.aaa.day01;

public class Zf {
    public static void main(String[] args) {

        ///斜杆具有转义功能  可以吧下一个的字符转换成普通字符 或者有特殊功能的字符
        //转义字符在特殊符号之前会吧特殊符号变成普通字符
        char a='\n';
        System.out.print("A");
        System.out.print(a);//a变成了换行
        System.out.println("B");

        char b='\t';//制表符

        System.out.print("A");
        System.out.print(b);
        System.out.println("B");

        System.out.println("\"");// "
        System.out.println("\\");//  \

        //char n='4e2d'; 错误
        char n='\u4e2d';// 中对应unicode编码中的4e2d
      /* 斜杆u代表后面的数字是unicode是编码*/
        System.out.println(n);


        char c='\u0000';//这是 char的默认值
        System.out.println(c);
    }
}

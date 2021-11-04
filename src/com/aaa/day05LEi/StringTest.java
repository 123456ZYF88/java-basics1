package com.aaa.day05LEi;

/*
* 字符类型
* 常用类
*
* */


public class StringTest {

    public static void main(String[] args) {
 /*       //创建方式1
    String str1="abcd bce df bcgh";
    String str2="123";
    String str3=".....";
    String str4="4567";
    //创建方式2.
    String s=new String();*/
 /*   //返回指定索引的字符串

       char c=str1.charAt(2);//c
        System.out.println(c);*/

/*//将指定的字符串str2追加到str1结尾
        String ab=str1.concat(str2);
        System.out.println(ab);//abcd bce df bcgh123*/
/*    //返回字符串中是否包含指定的char字符串
        boolean a=str1.contains("1");
        System.out.println(a);//false*/

/*        //判断字符串是以指定字符串结尾
        String str1="abcd bce df bcgh";
        String str2="123";
        boolean a=str1.endsWith("h");
        System.out.println(a);//true*/

     /*   //join 拼接字符串 将指定字符串拍拼接到一起
        String str1="abcd bce df bcgh";
        String str2="123";
        String str3=".....";
        String b=String.join("*",str1,str2,str3);
        System.out.println(b);//abcd bce df bcgh*123*.....
*/
/*        //用新字符串将所有的老字符串替换 关键字 replace
        String str1="abcd bce df bcgh";
        String a=str1.replace("df","34");
        System.out.println(a);//abcd bce 34 bcgh*/
/*        //使用指定的正则 将指定的字符串分割为数组。
        String str1="abcd bce df bcgh";

        String [] split =str1.split("b");
        System.out.println(Arrays.toString(split));

        String substring=str1.substring(0);
        System.out.println(substring);*/

        //字符串比较方法equals()         方法   比较字符串是否一样的
        String str1=" a bcgh";
        boolean a=str1.equals("bcgh");
        System.out.println(a);//false
        boolean b="abc".equals(str1);
        System.out.println(b);//false
        boolean c=" A bcgh".equalsIgnoreCase(str1);
        System.out.println(c);//true
    }
}

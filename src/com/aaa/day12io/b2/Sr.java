package com.aaa.day12io.b2;

import java.io.File;
import java.util.Scanner;
//:控制台输入一个字符串，以这个字符串为基准创建目录。
public class Sr {
    public static void cj(String s){
        File file=new File(s);
        if (!file.exists()){
            file.mkdirs();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cj(sc.next());

    }
}

package com.aaa.day12io.b2;

import java.io.File;
import java.util.Scanner;

public class SC {
    public void sc(String st){
        File file=new File(st);
        file.delete();
    }
    //输入绝对路劲文件夹删除次文件夹
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SC sc1=new SC();
        sc1.sc(sc.next());
    }
}

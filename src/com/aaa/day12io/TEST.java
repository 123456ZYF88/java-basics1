package com.aaa.day12io;

import java.io.*;

public class TEST {
    public static void main(String[] args) {
        File file=new File("D:\\java\\课堂笔记\\day01.txt");
        bl(file);
    }//"D:\\java\\课堂笔记\\day01.txt"
    public static  void bl(File file){
        try {
            InputStream in=new FileInputStream(file);
            int a;
            byte[] bytes =new byte[100];
            while ((a=in.read(bytes))!=-1){
                System.out.println(new String(bytes,0,a));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

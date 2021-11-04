package com.aaa.day12io.b2;

import java.io.*;


public class bailei {
        //遍历输出文件内容
    public static void sest1(File file){
        try {
            //输出流
            InputStream in=new FileInputStream(file);
            byte[] b=new byte[100];//byte数组
            int a=0;
            while ((a=in.read(b))>0){
                //输出的话可以用String接着 然后输出
                System.out.println(new String(b,0,a));
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
     File file = new File("D:\\java\\test01\\a.java");
    sest1(file);
    }

}

package com.aaa.day12io.b2;

import sun.java2d.InvalidPipeException;

import java.io.*;

public class FileinputStreamTest {
    public static void main(String[] args) {
        File file = new File("D:\\java\\课堂笔记\\day01.txt");

        read2(file);
    }
    public static void read(File file) {
        try {
            InputStream is = new FileInputStream(file);//创建输入流对象
            int a;
            int[] ints = new int[1024];//次时数组只能存储50个 会发生错误 如何解决
            int i = 0;
            for (; (a = is.read()) != -1; i++) {//如果这个内容不是-1就执行
                ints[i] = a;//但是byts数组范围只要1024
            }
            System.out.println(new String(ints, 0, i));//0,i 只将读取的转换。空的不转换
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void read2(File file) {

        try {
            InputStream in = new FileInputStream(file);
            int a;
            byte[] bytes = new byte[100];
            while ((a = in.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, a));
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

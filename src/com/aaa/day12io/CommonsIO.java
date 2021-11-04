package com.aaa.day12io;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CommonsIO {
    public static void main(String[] args) {
        File file=new File("D:\\java\\test01\\c.txt");
        fz(file);
        File file1=new File("D:\\java\\test01\\d.txt");
        fz1(file1);
    }
    static  void fz(File file){
        Long l1=System.currentTimeMillis();
        File file1=new File("D:\\java\\test01\\a.txt");
        try {
            //创建字符输入流
            FileReader fileReade=new FileReader(file1);
            //创建包装缓冲输入流
            BufferedReader fileReader=new BufferedReader(fileReade);
            //创建字符输出流
            FileWriter fileWrite=new FileWriter(file);
            //创建包装缓冲输出流
            BufferedWriter fileWriter=new BufferedWriter(fileWrite);
            //数据操作
            char[] bytes=new char[100];
            int length;
            while (-1 != (length = fileReader.read(bytes))){
                fileWriter.write(bytes,0,length);
            }
            fileWriter.newLine();//换行
            fileWriter.write("成功率");
            //关闭
            fileWriter.flush();
            fileWriter.close();
            fileReader.close();

            Long l2=System.currentTimeMillis();
            System.out.println(l2-l1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static  void fz1(File file){
        Long l1=System.currentTimeMillis();
        File file1=new File("D:\\java\\test01\\a.txt");
        try {
            Reader fileReader=new FileReader(file1);//字符输入流
            Writer fileWriter=new FileWriter(file); //字符输出流
            char[] bytes=new char[100];
            int length;
            while (-1 != (length = fileReader.read(bytes))){
                fileWriter.write(bytes,0,length);
            }
            fileWriter.write("成功率");
            fileWriter.flush();
            fileWriter.close();
            fileReader.close();
            Long l2=System.currentTimeMillis();
            System.out.println(l2-l1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

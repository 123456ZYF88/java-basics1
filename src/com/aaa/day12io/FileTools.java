package com.aaa.day12io;

import java.io.*;

public class FileTools {
//用递归的方式输出文件夹下的所有子文件
    public static void main(String[] args) {
        File file=new File("D:\\java");
        bl(file);
    }
    public static void bl(File file){
        File[] files=file.listFiles();
        for (File file1:files){
            System.out.println(file1.getAbsolutePath());
            if (file1.isDirectory()){
                bl(file1);
            }
        }
    }
}

package com.aaa.day12io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        /*File file =new File("D:\\java");//创建File对象
        boolean state=file.exists();//判断是否存在
        System.out.println(state);*/

        File file1=new File("D:\\java\\test01\\a.txt\\b.txt");
        //创建多个文件夹//mkdir是创建一个目录
       /* boolean state1=file1.exists();
        if(!state1){
            file1.mkdirs();
        }*/
//删除
      /*  File filed=new File("D:\\java\\test01\\a.txt\\b.txt");
        if(file1.exists()){
            System.out.println(file1.delete());
        }*/
        /*File file2=new File("D:\\java\\test01\\a.txt\\b.txt");
        if (!file2.exists()){
            try {
                file2.createNewFile();//创建一个新文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        //判断是否是一个目录；
       File file3=new File("D:\\java");
        System.out.println(file3.isDirectory()+","+file3.isFile());

        File[] lis=file3.listFiles();//把file3里面的所有目录给一个数组
        for(File f1:lis){//遍历数组输出路劲
            System.out.println(f1.getAbsolutePath());//获取绝对路径
        }
        System.out.println(file3.list());//  遍历目录下所有文件名和文件夹名(子代)；
        System.out.println(file3.getParent());//打印父目录；
        System.out.println(file3.listFiles());// 遍历目录下所有文件（目录）名，带路径；


    }
}

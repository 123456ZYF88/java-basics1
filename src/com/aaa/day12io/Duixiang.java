package com.aaa.day12io;

import javax.swing.*;
import java.io.*;

public abstract class Duixiang  {
    public static void main(String[] args) {
            duixiang();
    }
   public static void duixiang(){//序列化必须实现Serializable 接口
       try {
           //将对象序列化
           OutputStream os=new FileOutputStream("D:\\java\\test01\\c.txt");//输出流
           ObjectOutputStream oss=new ObjectOutputStream(os);//对象输出流
            Student stu=new Student(34,"zhangyifan");//对象
            oss.writeObject(stu);//写出对象
            oss.flush();
            oss.close();
            //将对象的反序列化
            InputStream is=new FileInputStream("D:\\java\\test01\\c.txt");//基本输入流
            ObjectInputStream ois=new ObjectInputStream(is);//包装对象输入流
            Student iss=(Student) ois.readObject();//流转换 对象类型
           System.out.println();
           System.out.println(ois);
           System.out.println(iss);

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
}

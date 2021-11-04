package com.aaa.day12io.ot;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Copy {
    //对文件只能读写只能是  文本文件
    //文件复制 没有限制  只需要输入 输出  不需要管内容；
    public static void main(String[] args) {
        copy();
        copy2();
    }
    static void copy(){

        try {
            long l1=System.currentTimeMillis();
            InputStream in=new FileInputStream("D:\\java\\test01\\a.doc");
            BufferedInputStream boi=new BufferedInputStream(in);
            OutputStream os=new FileOutputStream("D:\\java\\test01\\b.doc");
            BufferedOutputStream bos=new BufferedOutputStream(os);
            byte[] bytes=new byte[1];
            int a=0;
            while ((a=boi.read(bytes))!=-1){
                bos.write( bytes,0,a);
            }
            boi.close();
            bos.close();
            long l2=System.currentTimeMillis();
            System.out.println(l2-l1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void copy2(){

        try {
            long l1=System.currentTimeMillis();
            InputStream in=new FileInputStream("D:\\java\\test01\\a.doc");

            OutputStream os=new FileOutputStream("D:\\java\\test01\\b.doc");

            byte[] bytes=new byte[1];
            int a=0;
            while ((a=in.read(bytes))!=-1){
                os.write( bytes,0,a);
            }
            in.close();
            os.close();
            long l2=System.currentTimeMillis();
            System.out.println(l2-l1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void read3(){//读取文件包装
        File f1=new File("D:\\java\\test01\\a.doc");
        try {
            InputStream is=new FileInputStream(f1);
            BufferedInputStream bis =new BufferedInputStream(is);
            //创建一个字节输入流的包装流
            byte[] bytes=new byte[100];
            int a;
            while ((a=bis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,a));
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void write2(){//写入文件包装
        try {
            OutputStream os=new FileOutputStream("D:\\java\\test01\\a.doc",true);
            BufferedOutputStream bos=new BufferedOutputStream(os);
            //创建字节输出包装流
            String str="Hello World!";
            byte[] bytes=str.getBytes(StandardCharsets.UTF_8);
            bos.write(bytes);
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

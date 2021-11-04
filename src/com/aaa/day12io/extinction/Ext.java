package com.aaa.day12io.extinction;

import java.io.*;

public class Ext {
    public void test() {
        InputStream is = null;
        OutputStream os=null;
        int i=1/0;
        try {
            is = new FileInputStream("D:\\java\\test01\\c.txt");
             os = new FileOutputStream("D:\\java\\test01\\C.txt");
            byte[] bytes = new byte[100];
            int a;
            while ((a = is.read(bytes)) != -1) {
                os.write(bytes, 0, a);
            }
        } catch (Exception e){
                e.printStackTrace();
        }finally {
                if (is!=null){
                    try {
                        is.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
               if(os!=null){
                   try {
                       os.close();
                   }catch (Exception e){
                       e.printStackTrace();
                   }
               }
        }
    }


    public static void main(String[] args) {
            Ext ext=new Ext();
            ext.test();
    }

}

package com.aaa.day12io.charstream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FIlefz {
    public static void main(String[] args) {
        File file1=new File("D:\\java\\test01\\aNew.java");
        fz1(file1);
    }
    static  void fz1(File file){
        Long l1=System.currentTimeMillis();
        try {
            InputStream is=new FileInputStream("D:\\java\\test01\\a.java");//gbk编码的a.java
            InputStreamReader isr=new InputStreamReader(is,"gbk");
            OutputStream os=new FileOutputStream(file);
            OutputStreamWriter osw=new OutputStreamWriter(os, StandardCharsets.UTF_8);
            char[] bytes=new char[100];
            int length;
            while (-1 != (length = isr.read(bytes))){
                osw.write(bytes,0,length);
            }
            osw.write("成功率");
            osw.flush();
            osw.close();
            isr.close();
            Long l2=System.currentTimeMillis();
            System.out.println(osw);
            System.out.println(l2-l1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

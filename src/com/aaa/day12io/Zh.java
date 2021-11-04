package com.aaa.day12io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Zh {//"D:\\java\\test01\\a.gbk"

    public static void main(String[] args) {
        zh();
    }
    public static void zh(){
        try {
            InputStream in=new FileInputStream("D:\\java\\test01\\a.gbk");
            InputStreamReader ir=new InputStreamReader(in,"gbk");
            OutputStream os=new FileOutputStream("D:\\java\\test01\\anew.java");
            OutputStreamWriter oss=new OutputStreamWriter(os, StandardCharsets.UTF_8);
            char[] chars=new char[1024];
            int a;
            while ((a=ir.read(chars))!=-1){
                oss.write(chars,0,a);
            }
            oss.write("成功2016");
            oss.close();
            ir.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

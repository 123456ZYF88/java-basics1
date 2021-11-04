package com.aaa.day12io.ot;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileTools {
    public static void main(String[] args) {
    write1();
    }

    static void write1(){
        File file=new File("D:\\java\\test01\\a.doc");//选择文件
        //如果没有创建文件
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            //字节流    输出流   基础流
            OutputStream os=new FileOutputStream(file,true);//默认是覆盖
           // os.write();
            String str="Hello World!";//创建字符串
            byte[] bytes=str.getBytes();//吧字符串放_(:з」∠)_数组里面
            os.write(bytes);//写出数组
            os.flush();//强制吧缓存的东西推到流里面   刷新对象
            os.close();//关闭流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

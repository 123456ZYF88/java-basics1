package com.aaa.day09array;

public class Arraysc {
    public static String arraysc(int []ints){
        if(ints==null){
            return "你输入的数组是null，无法输出！";

        }else if (ints.length==0){
            return "[]";
        }
        StringBuffer buffer=new StringBuffer("[");
        for (int i=0;i<ints.length;i++){
            if(i==ints.length-1){
                buffer.append(ints[i]+"]");
            }else{
                buffer.append(ints[i]+",");
            }
        }
        return buffer.toString();
    }

}

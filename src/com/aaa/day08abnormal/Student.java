package com.aaa.day08abnormal;

import java.nio.charset.StandardCharsets;
class secException extends Exception{//自定义异常  SexException  性别异常

    public secException(String a) {//所有异常的父类都是 Exception 需要重新方法调用父类的
        super(a);//吧信息传递给Exception
    }
}
public class Student {
    private  String sex;
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) throws secException {

        if(sex=="男" || sex=="女"){
            this.sex = sex;
        }else{
            this.sex = "男";
            throw new secException("输入不对");
        }
    }

    public static void main(String[] args) {
        Student  stu=new Student();
        try{
            stu.setSex("男");//try检查这个可能出现的问题
        }catch (secException e){//
            e.printStackTrace();
        }


    }
}

package com.aaa.day06packaging.zy;

public class Teacher extends Person {
    /*定义一个教师类Teacher,继承于人类；
    （a）具有字段：职工号wordID，所教授的课程名curriculum,所属院系academy,并定义相应的属性
    （b）定义有参和无参构造函数。
    （c）定义一个普通方法teach（）,输出我是教学的。
    * */
    long wordID;
    String curriculum;
    String academy;
    public Teacher(){
        this.teach();
    }
    public Teacher(long wordID,String curriculum,String academy){
        this.wordID=wordID;
        this.curriculum=curriculum;
        this.academy=academy;
    }
    void teach(){
        System.out.println("我是教学的");
    }

   /* public static void main(String[] args) {
        Teacher js=new Teacher(412828,"魔法学","大魔法系");
       js.teach();

    }*/
}

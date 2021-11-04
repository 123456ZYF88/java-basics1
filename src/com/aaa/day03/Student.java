package com.aaa.day03;

public class Student {
    int age;
    String name;
    static String teacherName;

    public Student(String name,int age) {
        this.age=age ;
        this.name=name;

    }
    public void info() {
        //普通的方法：可以调用静态的东西
        System.out.println(name + "------" + age + "----" + teacherName);
    }
        //静态方法不能实例变量和实例方法
     public static void changeTeacher(String teaname) {
           teacherName = teaname;
           //System.out.println(name + "要求");
       }
        public static void main(String[] args) {
            Student tzk=new Student("米开朗基罗",20);
            Student lf=new Student("拉斐尔",20);
            Student.changeTeacher("lll");
            tzk.changeTeacher("ddd");
            System.out.println("------------"+Student.teacherName);
            System.out.printf(lf.name);
        }

}

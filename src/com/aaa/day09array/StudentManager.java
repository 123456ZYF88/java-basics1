package com.aaa.day09array;

import java.util.Arrays;

public class StudentManager{
    Student[] students=new Student[4];
    int length=0;
    public void dy(Student stu){
        if(students.length==length){//判断是否相同就需要添加
            students= Arrays.copyOf(students,length+2);

        }
        students[length]=stu;//吧这个数放到这个位置
        length++;
    }
    public boolean addcr(int index,Student stu){
        if(index>=length){
            return false;
        }
        for(int i=length-1;i>index;i--){
            students[i+1]=students[i];
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            Student stu = students[i];
            //System.out.println(stuendts[i]);
            System.out.println(stu);

            // System.out.println(stu.getName()+","+stu.getAge());
        }
        /*for(Student student:students){
            System.out.println(student);
        }*/
    }/*  查找下标*/
        public int search(Student search){
            for(int i=0;i<length;i++) {
                Student stu = students[i];
                //地址是否相同 stu==search
                //年龄姓名相同就是i i就是下标啦  这时候返回i就行了
               // if(stu.getName()==search.getName()&&stu.getAge()==search.getAge()){
                //String重写---对比值   Student 也重写也可以比对值
                if(stu.equals(search)){
                    {
                        return i;
                    }
                }
            }
            return -1;
        }
/*根据下标删除对象*/
        public  boolean delete(int index){
            if(index>=length){
                return  false;
            }else{
                for (int i=index;i<length-1;i++){
                    students[i]=students[i+1];
                }
                students[length-1]=null;
                length--;
                return true;
            }
        }
/*根据对象删除*/
        //删除 传入的学生 一  这个时候传入的是一个对象先调用search方法获取下标 在调用delte方法删除下标
    public boolean delete(Student deleteObj){//获取对象
            int index=this.search(deleteObj);//查下标
            if(index==-1){//判断是否有这个下标
                return false;
            }
            return  this.delete(index);//有就输出

    }
    /*根据下标修改*/
    public void aletr(int index,Student aletr1){
        students[index]=aletr1;
    }
    /* 根据对象修改*/
    public boolean aletr(Student aletr1,Student aletr2){
        int index=this.search(aletr1);
        if(index==-1){
            return false;
        }
        students[index]=aletr2;
       return true;
    }




}

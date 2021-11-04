package com.aaa.day09array.cs;

import java.util.Arrays;

public class CarManager {
    Car[] cars=new Car[1];
    int length=0;
    //声明一个CarManager管理类，初始化一个cars数组，初始长度为1，满了之后每次扩展2个
    public void add(Car car){
        if(cars.length==length){
            cars= Arrays.copyOf(cars,length+2);
        }
        cars[length]=car;
        length++;
    }

    public void print(){

        for (int i=0;i<length;i++){
            System.out.println(cars[i]);
        }
    }
    //获取下标
    public int index(Car car){

        for(int i=0;i<length;i++){
            if(cars[i].equals(car)){
                return i;
            }
        }
        return -1;
    }
    //修改对象删除
    public boolean alter(Car car,Car newcar){
        int index=this.index(car);
        if(index==-1){
            return false;
        }
        cars[index]=newcar;
        return true;
    }
    //删除 根据下标
    public boolean delete(int b){
        if(b>=length){
            return false;
        }else {
            for (int i=b;i<length;i++){
                cars[i]=cars[i+1];
            }
            cars[length-1]=null;
            length--;
        }
        return true;

    }

    public boolean delete(Car car){
        int index=this.index(car);
        if (index==-1){
            return false;
        }else {
            this.delete(index);
        }
        return true;
    }


}

package com.aaa.day09array.arrayObject;

import java.util.Arrays;

public class ParkManager {
    public Park[] parkManagers=new Park[4];
    int length=0;
    //tj
    public void add(Park park){
        if(parkManagers.length==length){
            parkManagers=Arrays.copyOf(parkManagers,length+2);
        }
        parkManagers[length]=park;
        length++;
    }
    public void print(){
        for(int i=0;i<length;i++){
            System.out.println(parkManagers[i]);
        }
    }
    //下标
    public int index(Park park){
        for(int i=0;i<length-1;i++){
            if(parkManagers[i].equals(park)){
                return i;
            }
        }
        return 0;
    }
    //下标删除
    public boolean delete(int index){
        if(index==-1){
            return false;
        }else {
            for (int i=index;i<length-1;i++){
                parkManagers[i]=parkManagers[i+1];
            }
            parkManagers[length-1]=null;
            length--;
        }
        return true;
    }
    //对象删除
    public boolean delete(Park park){
        int index=this.index(park);
        if(index<length-1){
            this.delete(index);
            return true;
        }
        return false;
    }
    //修改内容
    public boolean alter(Park park,Park newpark){
        int index=this.index(park);
        if(index==-1){
            return false;
        }else{
            parkManagers[index]=newpark;
        }
        return true;
    }

}
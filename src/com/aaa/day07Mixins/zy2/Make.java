package com.aaa.day07Mixins.zy2;



public class Make {
    public Pizza make(String name){
        //类中包含一个制作方法(String name)接受一个披萨的名字
        Pizza a=null;//创建一个地址来引用 这个new出来的对象
        if(name=="培根比萨"){
            a=new Pgpizza("培根比萨",36,9);
        }
        if(name=="海鲜披萨"){
            a=new Pgpizza("海鲜披萨",36,10);
        }
        return a;
    }

    public static void main(String[] args) {
        //，根据输入信息产生具体的比萨对象然后返回——返回值类型为披萨
        Make make=new Make();
        make.make("培根比萨");
        make.make("海鲜披萨");
        System.out.println();
    }


}

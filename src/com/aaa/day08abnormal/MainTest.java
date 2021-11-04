package com.aaa.day08abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        //异常处理
        try{//吧可能发生的错误放在try里面
            Scanner scanner =new Scanner(System.in);
            int aa=scanner.nextInt();//如果报错try的代码将不运行  去运行catch
            System.out.println(aa);
            int a=100/aa;
            System.out.println(a);
        }catch (ArithmeticException e){//判断异常是否是这个异常 如果1不是直接退出这个处理 终止程序
            System.out.println("抓到异常");
        //两个catch 先进行第一个匹配 如果不成功就匹配下一个 一直到匹配上或者到匹配不上   全都匹配不上就直接终止程序
        }catch (InputMismatchException e){
            System.out.println("抓到异常2");throw new InputMismatchException("应该输入数字");
        }finally {//非常方便的   应用：关闭IO流，关闭数据库连接等
            System.out.println("最终代码");//finally  最终的意思  无论代码出不出异常 有没有捕获异常的会执行的finally里面的代码块
        }//小结：异常的处理方式：要么抛，要么try
        System.out.println("try后面的啊");
    }
}

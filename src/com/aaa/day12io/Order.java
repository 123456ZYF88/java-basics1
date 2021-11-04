package com.aaa.day12io;

import java.text.SimpleDateFormat;
import java.util.*;

public class Order extends Details{

    static int sum=0;
    public Order(String proname, int price, int num) {
        super(proname, price, num);
        sum+=price*num;//定单价格
    }
    static ArrayList  listd=new ArrayList();
    public static void dd(){
        Map map=new HashMap();
        map.put("jg",sum);
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间
        String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
        map.put("时间",s);
        listd.add(map);
    }


    //时间
    public static String date(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间
        String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
        return s;
    }
    public static void main(String[] args) {

        List list1=new ArrayList();
        Scanner sc=new Scanner(System.in);
        for (int a=1;a<3;a++){
            System.out.println("请输入两个商品");
            List list=new ArrayList();
            list.add("订单"+a+"");
            for (int b=1;b<3;b++){
                System.out.println("请输入商品名称，商品价格");
                list.add(new Order(sc.next(), sc.nextInt(), sc.nextInt()));
            }
            dd();
            list.add("总价"+sum);
            list.add(date());
            sum=0;
            list1.add(list);
            list1.add("\n");
        }
        for (Object map:listd){

        }
        System.out.println(list1);
    }
}

package com.aaa.day12io.zy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static String date(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间
        String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
        return s;
    }

    public static void main(String[] args) {
        //循环录入两个订单，每个订单两个详情
        List<Order> orderList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=2;i++){
            Order order=new Order();
            //订单
            System.out.println("输入课户的名字时间 金额");
            String cusName=scanner.next();
            String buyDate=date(); //scanner.next();
            double totalMoney= scanner.nextDouble();
            order.setCusName(cusName);
            order.setByDate(buyDate);
            order.setTotalMoney(totalMoney);
            List<OrderDetail> details=new ArrayList<>();
            //商品列表
            for(int j=1;j<=2;j++){
                OrderDetail orderDetail=new OrderDetail();
                //商品
                System.out.println("请输入商品名 商品数量 商品单价");
                orderDetail.setProname(scanner.next());
                orderDetail.setNum(scanner.nextInt());
                orderDetail.setPrice(scanner.nextDouble());
                details.add(orderDetail);//商品添加到商品列表里面
            }
            order.setList(details);//商品列表放订单里面
            orderList.add(order);//订单放到订单列表里面
        }
        for (Order o:orderList){//遍历
            double max=o.getTotalMoney();
            double zmax=0;
            for(OrderDetail b:o.getList()){
               zmax+=b.getNum()*b.getPrice();
            }
            if (max!=zmax){
                o.setTotalMoney(zmax);
            }
            System.out.println(o);
        }
    }
}

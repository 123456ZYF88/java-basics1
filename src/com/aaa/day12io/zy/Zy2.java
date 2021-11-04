package com.aaa.day12io.zy;

import java.text.SimpleDateFormat;
import java.util.*;

public class Zy2 {
  /*  循环录入两个订单，订单信息使用Map来存储，包含订单时间  订单金额   详情列表[订单详情的List]。
    每一个订单循环录入两个商品列表：每一个商品是一个Map——proname：名字  price：单价 num:数量

	2.判断订单的金额和对应详情中计算的金额之和是否一致，不一致更改为一致。输出所有信息*/
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<Map> list=new ArrayList();
      Date date=new Date();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间
      String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
      int sum=0;
      for (int a=1;a<3;a++){//循环录入两个订单
          System.out.println("请输入商品");
          Map dd=new HashMap();

          for (int i=1;i<3;i++){//每一个订单循环录入两个商品列表
              System.out.println("请输入商品名字信息数量");
              Map map=new HashMap();//订单信息使用Map来存储
              map.put("proname",sc.next());
              map.put("price",sc.nextInt());
              map.put("num",sc.nextInt());
              int c=(int)map.get("price");
              int b=(int)map.get("num");
              dd.put("订单列表",map);
              sum+=c*b;
          }
          dd.put("订单时间",s);
          dd.put("订单金额",sum);
          list.add(dd);
          sum=0;
      }
      for (Map o:list){
          Map oo=(Map)o;
      // if ()
          oo.get("订单金额");
      }

      for (Object o:list){
          System.out.println(o);
      }
  }

}

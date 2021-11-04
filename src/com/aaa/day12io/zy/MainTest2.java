package com.aaa.day12io.zy;

import com.aaa.day12io.b2.SC;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainTest2 {
    public static String date(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd W w EEE hh:mm:ss");//格式化有一个时间
        String s=sdf.format(date); //将国际时间给这个  格式的 输出查看  format格式转化
        return s;
    }
    /*  循环录入两个订单，订单信息使用Map来存储，包含订单时间  订单金额   详情列表[订单详情的List]。
    每一个订单循环录入两个商品列表：每一个商品是一个Map——proname：名字  price：单价 num:数量

	2.判断订单的金额和对应详情中计算的金额之和是否一致，不一致更改为一致。输出所有信息*/
    public static void main(String[] args){
        List<Map> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=2;i++){
            Map map=new HashMap();
            System.out.println("请输入订单名称 金额");
            String name=scanner.next();
            double price= scanner.nextDouble();
            map.put("name",name);
            map.put("price",price);
            map.put("Date",date());
            List list1=new ArrayList();
            for (int j=1;j<=2;j++){
                Map map1=new HashMap();
                System.out.println("q请输入商品的名字单价数量");
                map1.put("proname",scanner.next());
                map1.put("prprice",scanner.nextDouble());
                map1.put("num",scanner.nextDouble());
                list1.add(map1);
            }
            map.put("List",list1);
            list.add(map);
        }

        for (Map map:list){
            double max=(double)map.get("price");
            double max1=0;
            List<Map> list1=(List<Map>) map.get("List");
            for (Map map2:list1){
                double a=(double)map2.get("prprice");
                double b=(double)map2.get("num");
                max1+=a*b;
            }
            if(max!=max1){
                map.put("price",max1);
            }
            max1=0;
        }
        for (Map map:list){
            System.out.println(map.get("name")+"==="+map.get("price")+","+map.get("Date"));
            List<Map> list1=(List<Map>) map.get("List");
            for (Map map1:list1){
                System.out.println(map1);
            }
        }
    }
}

package com.aaa.day11Map.zy2;

import java.util.*;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Student {
    ArrayList<Map> arrayList = new ArrayList<>();//声明一个班级列表，每一个班级声明一个Map
    Scanner sc = new Scanner(System.in);

    public void add() {
        for (int i = 1; i < 3; i++) {
            Map bj = new HashMap();//name班级名  count人   学生列表
            System.out.println("请输入班级" + i + "的名字和人数");
            bj.put("name", sc.next());
            bj.put("count", sc.nextInt());

            ArrayList stu = new ArrayList();
            for (int j = 1; j < 4; j++) {
                Map stumao=new HashMap();
                System.out.println("请输入同学的姓名");
                stumao.put("stuname",sc.next());
                stu.add(stumao);

            }
            bj.put("Student", stu);
            arrayList.add(bj);
        }
    }

    public void print() {
        for (Object arrayList : arrayList) {
            System.out.println(arrayList);
        }
    }

    public Object alter(String name) {//获取名字
     a: for (Map map:arrayList) {//先遍历arraylIst 的bj  在遍历bj 的Student
           List<Map>stus= (List<Map>)map.get("Student");//吧马培德值给Entry类型的entrys
            for (Map entry : stus) {
                if (name.equals(entry.get("stuname"))) {
                    return map.get("name");
                }
            }
        }
        return "-1";
    }
}

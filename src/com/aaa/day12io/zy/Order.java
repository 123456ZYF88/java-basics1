package com.aaa.day12io.zy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String cusName;
    private  String  byDate;
    private double totalMoney;
    //一个订单多个商品
    private List<OrderDetail> list;

    public List<OrderDetail> getList() {
        return list;
    }
    public   Order(){
    }

    public void setList(List<OrderDetail> list) {
        this.list = list;
    }

    public Order(String cusName, String byDate, double totalMoney, List<OrderDetail> list) {
        this.cusName = cusName;
        this.byDate = byDate;
        this.totalMoney = totalMoney;
        this.list = list;
    }

    public Order(String cusName, String byDate, double totalMoney) {
        this.cusName = cusName;
        this.byDate = byDate;
        this.totalMoney = totalMoney;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getByDate() {
        return byDate;
    }

    public void setByDate(String byDate) {
        this.byDate = byDate;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "订单{" +
                "客户='" + cusName + '\'' +
                ", 时间='" + byDate + '\'' +
                ", 总价=" + totalMoney +
                ", 商品详情" + list +
                '}';
    }
}

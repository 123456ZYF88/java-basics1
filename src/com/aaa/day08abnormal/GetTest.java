package com.aaa.day08abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=simpleDateFormat.parse("1999-0202");
        System.out.println(date);
    }
}

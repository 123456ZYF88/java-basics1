package com.aaa.day10gather.hashMapTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IuserTest {
    public static void main(String[] args) {

        Properties properties=new Properties();
        InputStream is=IuserTest.class.getResourceAsStream("luser.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties);
        System.out.println(properties.get("usezrname"));


    }
}

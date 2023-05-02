package com.itheima.test;

public class Test13 {
    public static void main(String[] args) {
        for (int i = 1988; i <= 2019; i++) {
//            if (i % 4 == 0) {
//                if (i%100!=0) System.out.println(i+"年是闰年");
//                else if(i%400==0) System.out.println(i+"年是闰年");
                if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                    System.out.println(i + "是闰年");
                }
            }
        }
    }

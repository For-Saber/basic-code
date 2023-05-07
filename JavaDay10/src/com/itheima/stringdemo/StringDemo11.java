package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {

        String id;
        Scanner sc=new Scanner(System.in);

        id=sc.next();
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        char gender=id.charAt(16);

        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");

        int num=gender-48;
        if (num%2==0) System.out.println("性别：女");
        else System.out.println("性别：男");
    }
}

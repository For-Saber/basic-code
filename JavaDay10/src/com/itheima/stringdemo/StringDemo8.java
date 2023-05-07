package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //手机号屏蔽

        String phoneNumber;
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            if (phoneNumber.length()==11)break;
            else System.out.println("请输入正确的手机号码！");
        }

        String num1=phoneNumber.substring(0,3);
        String num2=phoneNumber.substring(7);
        System.out.println("屏蔽结果为："+num1+"****"+num2);
    }
}

package com.itheima.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入支付金额：");
        Scanner sc=new Scanner(System.in);
        int cash= sc.nextInt();
        if (cash>=600) System.out.println("支付成功！");
        else System.out.println("支付失败！");
    }
}

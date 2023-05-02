package com.itheima.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        boolean flag1 = true;
        int CustomerType = 0;
        int Money = 0;
        while (flag1) {
            System.out.println("请输入顾客类型（0为普通顾客，1为会员顾客）:");
            Scanner sc1 = new Scanner(System.in);
            CustomerType = sc1.nextInt();
            if (CustomerType < 0 || CustomerType > 1) {
                System.out.println("请输入正确顾客类型！");
            } else flag1 = false;
        }
        boolean flag2 = true;
        while (flag2) {
            System.out.println("请输入花费金额:");
            Scanner sc2 = new Scanner(System.in);
            Money = sc2.nextInt();
            if (Money < 0)
                System.out.println("请输入正确金额！");
            else flag2 = false;
        }
        double Result = 0.0;
        if (CustomerType == 0) {
            if (Money < 100) Result = Money;
            else Result = Money * 0.9;
        } else {
            if (Money < 200) Result = Money * 0.8;
            else Result = Money * 0.75;
        }
        System.out.println("支付金额为：" + Result);
    }
}

package com.itheima.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        int dividend = 0;
        int divisor = 0;
        int count = 0;
        int result;
        int remain;
        boolean flag = true;

        //输入数据
        while (flag) {
            System.out.println("请输入被除数（正整数）：");
            Scanner sc1 = new Scanner(System.in);
            dividend = sc1.nextInt();
            if (dividend > 0) flag = false;
            else System.out.println("输入错误！");
        }

        flag = true;

        while (flag) {
            System.out.println("请输入除数（正整数）：");
            Scanner sc2 = new Scanner(System.in);
            divisor = sc2.nextInt();
            if (divisor > 0) flag = false;
            else System.out.println("输入错误！");
        }

        //逐个相减
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }

        remain = dividend;

        System.out.println("商为" + count);
        System.out.println("余数为" + remain);
    }
}

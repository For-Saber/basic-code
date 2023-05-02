package com.itheima.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        int original;
        int month;
        int seat;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入机票原价：");
            original = sc.nextInt();
            if (original > 0) break;
            else System.out.println("请输入正确的数据！");
        }


        while (true) {
            System.out.println("请输入月份：");
            month = sc.nextInt();
            if (month > 0 && month < 13) break;
            else System.out.println("请输入正确的数据！");
        }

        while (true) {
            System.out.println("请输入舱位类型：");
            seat = sc.nextInt();
            if (seat == 0 || seat == 1) break;
            else System.out.println("请输入正确的数据！");
        }

        double price = getPrice(original,month,seat);
        System.out.println("折扣票价为："+price);

    }

    public static double getPrice(int original, int month, int seat) {
        int price = 0;
        if (month >= 5 && month <= 10) {
            switch (seat) {
                case 0 -> {
                    return original * 0.9;
                }
                case 1 -> {
                    return original * 0.85;
                }
            }
        } else {
            switch (seat) {
                case 0 -> {
                    return original * 0.7;
                }
                case 1 -> {
                    return original * 0.65;
                }
            }
        }
        return original;
    }
}

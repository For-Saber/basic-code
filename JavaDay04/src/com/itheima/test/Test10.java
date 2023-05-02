package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        int num = 0;
        int x = 0;
        int y = 0;
        int output = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("请输入一个正整数：");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num > 0) flag = false;
            else System.out.println("输入错误！");
        }

        x = num;//使用临时变量存储数字
        while (x >= 1) {
            output = x % 10;//从左往右获取每个数字
            x = x / 10;
            y = y * 10 + output;//将当前获取的数字拼接到结果最右边
        }
        if (y == num) System.out.println("是回文数！");
        else System.out.println("不是回文数！");
    }
}

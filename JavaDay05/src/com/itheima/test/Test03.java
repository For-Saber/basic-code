package com.itheima.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        //判断是否为质数
        boolean flag = true;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("请输入大于2的正整数：");
            num = sc.nextInt();
            if (num > 1) flag = false;
            else System.out.println("输入错误！");
        }

        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + "是合数");
                break;
            }
        }
        if (i == num) System.out.println(num + "是质数");
    }
}

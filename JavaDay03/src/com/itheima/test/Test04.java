package com.itheima.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //比较三个和尚的身高，输出最大值
        System.out.println("请输入第一个和尚身高：");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("请输入第二个和尚身高：");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("请输入第三个和尚身高：");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        int bigger = a > b ? a : b;
        int max = bigger > c ? bigger : c;
        System.out.println("最高的是" + max);
        //Ctrl+alt+L 自动格式化代码
    }
}

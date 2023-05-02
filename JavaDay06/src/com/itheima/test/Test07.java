package com.itheima.test;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double num = sc.nextDouble();
        method(num);

    }

    public static void method(double num) {
        System.out.print("这个数的绝对值为：");
        if (num >= 0) System.out.println(num);
        else System.out.println(-num);
    }

}

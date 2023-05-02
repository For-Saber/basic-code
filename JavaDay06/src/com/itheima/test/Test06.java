package com.itheima.test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        method(a,b,c);

    }

    public static void method(int a, int b, int c) {

        int temp1 = a > b ? a : b;
        int max = temp1 > c ? temp1 : c;

        int temp2 = a < b ? a : b;
        int min = temp2 < c ? temp2 : c;

        int sum = a + b + c;
        int mid = sum - max - min;

        System.out.println(min+" "+mid+" "+max);
    }
}

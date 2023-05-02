package com.itheima.test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;

        System.out.println("请输入第一个数字：");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("请输入第二个数字：");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();

        if (a == b) sum = a;
        else if (a < b) for (int i = a; i <= b; i++) sum += i;
        else if (a > b) for (int j = b; j <= a; j++) sum += j;
        System.out.println("求和结果为" + sum);
    }
}

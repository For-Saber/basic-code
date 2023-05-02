package com.itheima.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //定义方法，比较两个长方形的面积
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个长方形的长：");
        int a1 = sc.nextInt();
        System.out.println("请输入第一个长方形的宽：");
        int a2 = sc.nextInt();
        System.out.println("请输入第二个长方形的长：");
        int b1 = sc.nextInt();
        System.out.println("请输入第二个长方形的宽：");
        int b2 = sc.nextInt();

        compare(a1,a2,b1,b2);

    }

    public static int getArea(int a, int b) {
        int area = a * b;
        return area;
    }

    public static void compare(int a, int b, int c, int d) {
        int area1 = getArea(a, b);
        int area2 = getArea(c, d);
        if (area1 > area2) System.out.println("第一个比较大");
        else if (area1 < area2) System.out.println("第二个比较大");
        else System.out.println("两个一样大");

    }

}

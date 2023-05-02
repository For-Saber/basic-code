package com.itheima.test;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入您的时髦程度（1~10的整数）：");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        System.out.println("请输入相亲对象的时髦程度（1~10的整数）：");
        Scanner sc2=new Scanner(System.in);
        int b=sc2.nextInt();
//        if(a>b) System.out.println("相亲成功！");
//        else System.out.println("相亲失败！");
        boolean result=a>b;
        System.out.println(result);
    }
}

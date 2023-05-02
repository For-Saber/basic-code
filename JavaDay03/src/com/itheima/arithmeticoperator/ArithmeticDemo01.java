package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticDemo01 {
    //主入口
    public static void main(String[] args) {
        //键盘录入一个三位数，输出个位、十位、百位
        //1.键盘录入
        System.out.println("请输入一个三位数");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        //2.拆分
        System.out.println("个位："+num%10);
        System.out.println("十位："+num/10%10);
        System.out.println("百位："+num/100);
    }
}

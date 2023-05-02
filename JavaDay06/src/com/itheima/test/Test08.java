package com.itheima.test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num=sc.nextInt();

        int count=getCount(num);
        System.out.println(num+"是一个"+count+"位数字");

    }

    public static int getCount(int num){

        int count=1;
        while (num>=10){
            num/=10;
            count++;
        }

        return count;
    }
}

package com.itheima.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        //求整数的算术平方根，结果保留整数部分

        boolean flag=true;
        int num=0;

        while (flag) {
            System.out.println("请输入数字（大于等于2的正整数）：");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num > 1) flag = false;
            else System.out.println("输入错误！");
        }

        for(int i=1;i<num;i++)
        {
            if(i*i==num){
                System.out.println(num+"的算术平方根为"+(i));break;
            }
            else if(i*i>num){
                System.out.println(num+"的算术平方根为"+(i-1));break;
            }
        }
    }
}

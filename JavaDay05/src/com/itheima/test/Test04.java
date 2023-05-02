package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //获取随机数
        Random r=new Random();
//        r.nextInt(100);//范围一定从0开始到这个数-1结束
        int num=r.nextInt(100)+1;

        System.out.println("请输入你要猜的整数：");

        int guessNum=0;
        int count=0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            guessNum = sc.nextInt();
            count++;
            if(count==10) {System.out.println("猜对了！（保底）");
            break;}

            if (guessNum < num) System.out.println("小了！");
            else if (guessNum > num) System.out.println("大了！");
            else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}

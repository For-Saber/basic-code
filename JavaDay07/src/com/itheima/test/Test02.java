package com.itheima.test;

public class Test02 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 101; i < 201; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
//                  System.out.println(i + "是合数");
                    break;
                }
                if (j == i - 1) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        System.out.println("总计"+count+"个");
    }
}



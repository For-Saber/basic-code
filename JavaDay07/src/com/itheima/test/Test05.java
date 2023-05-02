package com.itheima.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int max = 0;
        int min = 100;
        int sum = 0;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入6位评委的打分：");

        for (int i = 0; i < arr.length; ) {

            arr[i] = sc.nextInt();
            if (arr[i] <= 100 && arr[i] >= 0) i++;
            else System.out.println("输入超出范围，请重新输入：");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        result = (sum - max - min) / (arr.length - 2);
        System.out.println("最终得分：" + result);
    }
}

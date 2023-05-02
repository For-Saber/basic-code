package com.itheima.test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {

        int[] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[arr1.length + 1];

        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个整数：");
        int num = sc.nextInt();

        int i;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] > num) break;
        }
        for (int j = 0; j < i; j++) {
            arr2[j] = arr1[j];
        }
        arr2[i] = num;
        for (int j = i + 1; j < arr2.length; j++) {
            arr2[j] = arr1[j - 1];
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.printf(String.valueOf(arr2[j]) + " ");
        }
    }
}

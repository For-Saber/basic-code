package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {

        //1.生成中奖号码
        int[] arr = creatNumber();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //2.用户输入抽奖号码
        int[] userInputArr = userInput();

        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }
        System.out.println();

        //3.判断用户的中奖情况

        output(arr, userInputArr);

    }

    public static int[] creatNumber() {

        int[] arr = new int[7];
        Random r = new Random();

        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            if (!contain(arr, redNumber)) {
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contain(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }

    public static int[] userInput() {

        int[] arr = new int[7];
        //2.用户输入中奖号码
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                if (!contain(arr, redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else System.out.println("输入重复，请重新输入！");
            } else System.out.println("输入超出范围，请重新输入！");
        }

        while (true) {

            System.out.println("请输入蓝球号码：");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else System.out.println("输入超出范围，请重新输入！");

        }
        return arr;
    }

    public static void output(int[] arr, int[] userInputArr) {

        int redCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < userInputArr.length - 1; j++) {
                if (userInputArr[j] == arr[i]) {
                    redCount++;
                    break;
                }
            }
        }

        if (arr[arr.length - 1] == userInputArr[userInputArr.length - 1]) {
            switch (redCount) {
                case 1, 2 -> System.out.println("六等奖5元");
                case 3 -> System.out.println("五等奖10元");
                case 4 -> System.out.println("四等奖200元");
                case 5 -> System.out.println("三等奖3000元");
                case 6 -> System.out.println("一等奖最高1000万元");
                default -> System.out.println("没有中奖");
            }
        } else {
            switch (redCount) {
                case 4 -> System.out.println("五等奖10元");
                case 5 -> System.out.println("四等奖200元");
                case 6 -> System.out.println("二等奖最高500万元");
                default -> System.out.println("没有中奖");
            }
        }

    }
}
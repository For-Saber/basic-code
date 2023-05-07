package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额（0~7位正整数）");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入错误，请重新输入！");
            }
        }

        String capitalized = getCapital(money);
        getMoney(capitalized);
    }

    public static String getCapital(int num) {
        char[] chs = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        int[] arr = new int[7];
        int i = 0;
        String result = "";

        while (num > 0) {
            arr[i++] = num % 10;
            num /= 10;
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            int index = arr[j];
            result += chs[index];
        }
        return result;
    }

    public static void getMoney(String str) {

        String newStr="";
        String[] arr={"佰","拾","万","仟","佰","拾","元"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(str.charAt(i)+arr[i]);
        }
    }
}

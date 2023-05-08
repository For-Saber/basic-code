package com.itheima.test;

public class Test05 {

    public static void main(String[] args) {

        String num1 = "12345";
        String num2 = "123";
        double result=getInteger(num1)*getInteger(num2);
        System.out.println(result);
    }

    public static int getInteger(String str) {
        char[] arr = str.toCharArray();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i] - 48;
        }

        return num;
    }
}

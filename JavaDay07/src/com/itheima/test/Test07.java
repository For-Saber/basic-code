package com.itheima.test;

public class Test07 {
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int count = 1;

        while (num >= 10) {
            num /= 10;
            count++;
        }

        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) arr[i] += 5;
            else arr[i] -= 5;
            System.out.print(arr[i] + " ");
        }
    }
}

package com.itheima.stringdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                sb.append(arr[i]).append(",");
            else sb.append(arr[i]);
        }//代码其实还是很复杂，拼接速度慢（StringJoiner更快速）
        String result = sb.append("]").toString();
        System.out.println(result);
    }
}

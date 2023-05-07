package com.itheima.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        String result = arrToString(arr);
        System.out.println(result);

    }

    public static String arrToString(int arr[]) {

        String s = "[";
        if (arr.length == 0) {
            return "[]";
        } else {
            for (int i = 0; i < arr.length; i++) {
                s += arr[i];
                if (i != arr.length - 1) {
                    s += ",";
                }
            }
            s += "]";
        }
        return s;
    }

}

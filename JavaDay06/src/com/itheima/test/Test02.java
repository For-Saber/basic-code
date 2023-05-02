package com.itheima.test;

public class Test02 {
    public static void main(String[] args) {

        int[] arr={11,22,33,44,55};
        getArray(arr);
    }
    public static void getArray(int[] arr){

        System.out.print("["+arr[0]+" ");
        for (int i = 1; i <arr.length; i++) {
            if(i!= arr.length-1) System.out.print(arr[i]+" ");
            else System.out.println(arr[i]+"]");
        }
    }
}

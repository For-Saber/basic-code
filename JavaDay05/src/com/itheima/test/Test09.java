package com.itheima.test;

public class Test09 {
    public static void main(String[] args) {
        int[] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[arr1.length];

        int j=0;
        int k= arr2.length;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==1)arr2[j++]=arr1[i];
            else arr2[--k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i]+" ");
        }
    }
}

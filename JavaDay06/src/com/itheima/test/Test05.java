package com.itheima.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入开始索引：");
        int begin=sc.nextInt();
        System.out.println("请输入结束索引：");
        int end=sc.nextInt();

        int[] result=copyOfRange(arr,begin,end);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr1,int from,int to){

        int len=to-from+1;
        int[] arr2=new int[len];
        for (int i = from-1,j=0; i < to; i++,j++) {
            arr2[j]=arr1[i];
        }
        return arr2;
    }

}


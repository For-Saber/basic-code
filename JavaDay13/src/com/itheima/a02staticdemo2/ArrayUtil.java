package com.itheima.a02staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {

    private ArrayUtil(){}//不让外界创建工具类的对象

    public static String printArr(int[] arr){

        StringBuilder sb=new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length-1; i++) {

            sb.append(arr[i]);
            sb.append(",");
        }
        sb.append(arr[arr.length-1]);
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

}

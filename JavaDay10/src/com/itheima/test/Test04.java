package com.itheima.test;

import java.beans.JavaBean;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {

        //验证码
        char[] arr = new char[52];
        String str="";
        Random r=new Random();

        for (int i = 0; i < 26; i++) {
            arr[i] = (char) (97 + i);
        }
        for (int i = 26; i < arr.length; i++) {
            arr[i] = (char) (65 + i - 26);
        }

        for (int i = 0; i < 4; i++) {
            str+=getRandomChar(arr);
        }

        str+=r.nextInt(10);
        char[] newArr=str.toCharArray();
        newArr=randomSort(newArr);
        str="";

        for (int i = 0; i < newArr.length; i++) {
            str+=newArr[i];
        }

    }

    public static char getRandomChar(char[] arr){

        Random r=new Random();

        int index=r.nextInt(arr.length);
        return arr[index];
    }

    public static char[] randomSort(char[] arr){

        Random r=new Random();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            int index=r.nextInt(arr.length);
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }
}

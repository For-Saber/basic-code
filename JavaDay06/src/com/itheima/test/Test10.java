package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {

        int[] arr = {2, 588, 888, 1000, 10000};

        getRandNum(arr);
    }

    public static void getRandNum(int[] arr) {

        Random r = new Random();
        int count = 0;
        boolean[] indexStat = new boolean[arr.length];

        while (count < arr.length) {
            int index = r.nextInt(arr.length);
            if (indexStat[index] == false) {
                System.out.println(arr[index] + "的奖金被抽出");
                indexStat[index] = true;
                count++;
            }
        }
    }


}

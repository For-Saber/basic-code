package com.itheima.test;

public class Test09 {
    public static void main(String[] args) {

        //二维数组
        int[][] arr = new int[][]{
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

//        int sum1 = 0;
//        int sum2 = 0;
//        int sum3 = 0;
//        int sum4 = 0;

//        for (int i = 0; i < 3; i++) sum1 += arr[0][i];
//        for (int i = 0; i < 3; i++) sum2 += arr[1][i];
//        for (int i = 0; i < 3; i++) sum3 += arr[2][i];
//        for (int i = 0; i < 3; i++) sum4 += arr[3][i];
//
// for (int i = 0; i < 4; i++) {
//     for (int j = 0; j < 3; j++) {
//         sum += arr[i][j];
//     }
// }
//        int sum = sum1 + sum2 + sum3 + sum4;
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int quarterSum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "季度的营业额为：" + quarterSum);
            yearSum+=quarterSum;
        }
        System.out.println("年度总营业额为："+yearSum);

    }

    public static int getSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            sum += j;
        }
        return sum;
    }
}


package com.itheima.test.test6;

public class TestGirlFriend {

    public static void main(String[] args) {

        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("呱呱", 19, "轮滑");
        GirlFriend g2 = new GirlFriend("罗卓珩", 17, "泡泡玛特");
        GirlFriend g3 = new GirlFriend("芝士", 20, "史莱姆");
        GirlFriend g4 = new GirlFriend("蛋糕", 22, "周杰伦");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }

        double avg = sum / arr.length;
        System.out.println(avg);
        int count=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getGender() + " " + arr[i].getHobby());
                count++;
            }

        }
        System.out.println(count+"个");
    }
}

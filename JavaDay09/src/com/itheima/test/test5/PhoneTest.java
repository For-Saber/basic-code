package com.itheima.test.test5;

public class PhoneTest {

    public static void main(String[] args) {

        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 5999, "蓝色");
        Phone p3 = new Phone("苹果", 7999, "黑色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {

            Phone p = arr[i];
            sum += p.getPrice();
        }

        double avg = sum / arr.length;

        System.out.println("平均价格为：" + avg);
    }
}

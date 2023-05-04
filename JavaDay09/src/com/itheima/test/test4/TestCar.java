package com.itheima.test.test4;

import java.util.Scanner;

public class TestCar {

    public static void main(String[] args) {

        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            Car car = new Car();
            arr[i] = car;

            System.out.println("请输入第" + (i + 1) + "辆车的品牌");
            String brand = sc.next();
            car.setBrand(brand);

            System.out.println("请输入第" + (i + 1) + "辆车的价格");
            double price = sc.nextDouble();
            car.setPrice(price);

            System.out.println("请输入第" + (i + 1) + "辆车的颜色");
            String color = sc.next();
            car.setColor(color);

        }

        for (int i = 0; i < arr.length; i++) {

            Car car = arr[i];
            String brand = car.getBrand();
            System.out.print(brand + " ");

            double price = car.getPrice();
            System.out.print(price + " ");

            String color = car.getColor();
            System.out.println(color);

        }
    }
}

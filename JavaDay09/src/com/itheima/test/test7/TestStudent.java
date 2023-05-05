package com.itheima.test.test7;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Student[] arr = new Student[3];

        Student s1 = new Student("0001", "杜思宏", 22);
        Student s2 = new Student("0002", "罗卓珩", 19);

        arr[0] = s1;
        arr[1] = s2;

        Student s3 = new Student();
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {

            System.out.println("请输入新增学号：");
            id = sc.next();
            if (contains(arr, id)) {
                System.out.println("学号已存在！");
            } else break;

        }

        s3.setId(id);
        System.out.println("请输入姓名：");
        String name = sc.next();
        s3.setName(name);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        s3.setAge(age);

        //判断数组是否存满
        int count = getCount(arr);
        if (count == arr.length) {
            Student[] newArr = new Student[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[count] = s3;
            getInfo(newArr);
        } else {
            arr[count] = s3;
            getInfo(arr);
        }
    }


    //判断id是否存在
    public static boolean contains(Student[] arr, String id) {
        for (int i = 0; i < (getCount(arr)); i++) {
            Student s = arr[i];
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //定义方法判断数组中有几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) count++;
            else break;
        }
        return count;
    }

    public static void getInfo(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null) {
                System.out.println("学号：" + s.getId() + " " + "姓名：" + s.getName() + " " + "年龄：" + s.getAge());
            }
        }
    }

}

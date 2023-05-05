package com.itheima.test.test7;

import java.util.Scanner;

public class TestModify {
    public static void main(String[] args) {

        Student[] arr = new Student[3];

        Student s1 = new Student("0001", "杜思宏", 22);
        Student s2 = new Student("0002", "罗卓珩", 19);
        Student s3 = new Student("0003", "小北", 21);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        int modIndex;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入欲修改学生的ID：");
            String modID = sc.next();
            modIndex = getIndex(arr, modID);

            if (modIndex == -1) {
                System.out.println("修改失败，当前ID不存在！");
            } else {
                System.out.println("年龄修改为：");
                int newAge=sc.nextInt();
                arr[modIndex].setAge(newAge);
                System.out.println("修改成功！");
                break;
            }
        }
            getInfo(arr);
    }

    public static int getIndex(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];

            if (s != null) {
                String sid = s.getId();
                if (sid.equals(id)) {
                    return i;
                }
            }
        }
        //不存在的情况
        return -1;
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

package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList01 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象并加入集合中

        Student stu1 = new Student("提速狗", "12345", "00001");
        Student stu2 = new Student("小北", "56789", "00002");
        Student stu3 = new Student("ForSaber", "99999", "00003");//2
        Student stu4 = new Student("Marscrow", "66666", "00004");

        Scanner sc = new Scanner(System.in);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        System.out.println("输入查询id：");
        String input = sc.next();
        int result = getIndexByID(list, input);
        System.out.println(result);
    }

    public static int getIndexByID(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) return i;
        }
        return -1;
    }
}

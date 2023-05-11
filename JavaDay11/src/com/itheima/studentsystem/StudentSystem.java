package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            mainMenu();
            selectOptions(list);
        }
    }

    public static void mainMenu() {

        System.out.println();
        System.out.println("------------------学生管理系统------------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("按0退出系统");

    }

    public static void selectOptions(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case '1' -> addStudent(list);
            case '2' -> deleteStudent(list);
            case '3' -> editStudent(list);
            case '4' -> getAllInfo(list);
            case '0' -> System.exit(0);
        }
    }

    public static void addStudent(ArrayList<Student> list) {

        System.out.println(new String(new char[50]).replace("\0", "\r\n"));//伪清屏
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        //先查询是否已存在
        String newSid;

        while (true) {
            System.out.println("请输入要添加的学生ID：");
            newSid = sc.next();
            if (contains(list, newSid)) System.out.println("学生ID已存在，请重新输入！");
            else break;
        }

        stu.setSid(newSid);
        System.out.println("请输入要添加的学生姓名：");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入要添加的学生年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入要添加的学生所在地：");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        list.add(stu);
        System.out.println("添加成功！输入任意字符继续。");
        sc.next();
    }

    public static void deleteStudent(ArrayList<Student> list) {

        System.out.println(new String(new char[50]).replace("\0", "\r\n"));//伪清屏
        System.out.println("请输入要删除的学生ID：");
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();

        if (contains(list, deleteSid)) {
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                list.remove(stu);
                System.out.println("删除成功！输入任意字符继续。");
                sc.next();
            }
        } else {
            System.out.println("没有查询到对应的学生ID！输入任意字符继续。");
            sc.next();
        }
    }

    public static void editStudent(ArrayList<Student> list) {

        System.out.println(new String(new char[50]).replace("\0", "\r\n"));//伪清屏
        System.out.println("请输入要修改的学生ID：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        if (contains(list,sid)){

            Student stu = new Student();
            stu.setSid(sid);
            System.out.println("请输入新的学生姓名：");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入新的学生年龄：");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入新的学生所在地：");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            int index = getIndexByID(list, sid);
            list.set(index, stu);
            System.out.println("修改成功！输入任意字符继续。");
        } else {
            System.out.println("没有查询到对应的学生ID！");
        }
        sc.next();
    }

    public static void getAllInfo(ArrayList<Student> list) {

        System.out.println(new String(new char[50]).replace("\0", "\r\n"));//伪清屏
        System.out.println("以下是所有学生信息：");
        for (int i = 0; i < list.size(); i++) {

            Student stu = list.get(i);

            System.out.println(
                    "学生ID：" + stu.getSid() + " " +
                            "学生姓名：" + stu.getName() + " " +
                            "学生年龄：" + stu.getAge() + " " +
                            "学生所在地：" + stu.getAddress());

        }

        System.out.println("\n查询完毕。输入任意字符继续。");
        Scanner sc = new Scanner(System.in);
        sc.next();

    }

    public static boolean contains(ArrayList<Student> list, String sid) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getSid().equals(sid)) return true;
        }
        return false;
    }

    public static int getIndexByID(ArrayList<Student> list, String sid) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getSid().equals(sid)) return i;
        }
        return -1;
    }

}

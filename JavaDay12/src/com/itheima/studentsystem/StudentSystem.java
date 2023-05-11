package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Student> stuList = new ArrayList<>();

        while (true) {

            login(userList);
            mainMenu(stuList);

        }
    }

    public static void login(ArrayList<User> list) {

        System.out.println("------------------学生管理系统------------------");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
        System.out.println("按0退出系统");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case '1' -> signIn(list);
            case '2' -> signUp(list);
            case '3' -> forgetPassword(list);
            case '0' -> System.exit(0);
        }
    }

    public static void signIn(ArrayList<User> list) {

        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String username = sc.next();
            User user = new User();
            boolean flag = false;

            for (int i = 0; i < list.size(); i++) {
                user = list.get(i);
                if (user.getUsername().equals(username)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("请输入密码");
                String password = sc.next();
                if (user.getPassword().equals(password)) {
                    while (true) {
                        String code = verificationCode();
                        System.out.println(code);
                        System.out.println("请输入验证码：");
                        String input = sc.next();
                        if (input.equals(code)) {
                            System.out.println("登录成功！");
                            break loop;
                        }
                        else {
                            System.out.println("验证码错误！请重新输入。");
                        }
                    }

                }
            } else {
                System.out.println("用户名不存在，请注册后重新登录！");
            }
        }

        //
    }

    public static String verificationCode() {

        //验证码
        char[] arr = new char[52];
        StringBuilder str = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 26; i++) {
            arr[i] = (char) (97 + i);
        }
        for (int i = 26; i < arr.length; i++) {
            arr[i] = (char) (65 + i - 26);
        }

        for (int i = 0; i < 4; i++) {
            str.append(getRandomChar(arr));
        }

        str.append(r.nextInt(10));
        char[] newArr = str.toString().toCharArray();
        newArr = randomSort(newArr);
        str = new StringBuilder();

        for (int i = 0; i < newArr.length; i++) {
            str.append(newArr[i]);
        }
        return str.toString();
    }

    public static char getRandomChar(char[] arr) {

        Random r = new Random();

        int index = r.nextInt(arr.length);
        return arr[index];
    }

    public static char[] randomSort(char[] arr) {

        Random r = new Random();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }


    public static void signUp(ArrayList<User> list) {
        //todo
    }

    public static void forgetPassword(ArrayList<User> list) {
        //todo
    }


    public static void mainMenu(ArrayList<Student> list) {

        System.out.println();
        System.out.println("------------------学生管理系统------------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("按0退出系统");

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
            if (containsStu(list, newSid)) System.out.println("学生ID已存在，请重新输入！");
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

        if (containsStu(list, deleteSid)) {
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
        if (containsStu(list, sid)) {

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

    public static boolean containsStu(ArrayList<Student> list, String sid) {
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

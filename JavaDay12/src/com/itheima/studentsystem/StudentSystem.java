package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Student> stuList = new ArrayList<>();

        while (true) {
            login(userList, stuList);
        }
    }

    public static void login(ArrayList<User> userList, ArrayList<Student> stuList) {

        System.out.println("------------------学生管理系统------------------");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
        System.out.println("按0退出系统");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case '1' -> {
                if (signIn(userList)) mainMenu(stuList);
            }
            case '2' -> signUp(userList);
            case '3' -> forgetPassword(userList);
            case '0' -> System.exit(0);
            default -> System.out.println("没有此选项！");
        }
    }

    public static boolean signIn(ArrayList<User> list) {

        int count = 0;
        while (count < 3) {
            Scanner sc = new Scanner(System.in);
            User user = new User();
            boolean flag = false;

            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            for (int i = 0; i < list.size(); i++) {
                user = list.get(i);
                if (user.getUsername().equals(username)) {
                    flag = true;
                    break;
                }
            }

            while (true) {
                String code = verificationCode();
                System.out.println(code);
                System.out.println("请输入验证码：");
                String input = sc.next();
                if (input.equals(code)) {
                    break;
                } else {
                    System.out.println("验证码错误！请重新输入。");
                }
            }

            if (flag) {
                if (user.getPassword().equals(password)) {
                    System.out.println("登录成功！");
                    return true;
                } else {
                    System.out.println("密码错误！还剩余" + (2 - count) + "次机会");
                }
            } else {
                System.out.println("用户名不存在，请先注册后登录！");
                return false;
            }
            count++;
        }

        System.out.println("登录失败！");
        return false;

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
        randomSort(newArr);
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

    public static void randomSort(char[] arr) {

        Random r = new Random();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = temp;
        }

    }


    public static void signUp(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        String username;

        while (true) {
            System.out.print("请输入要注册的用户名\n（长度必须在3~15位之间，只能是字母加数字的组合，但是不能是纯数字）：\n");
            username = sc.next();
            if (checkUsername(list, username)) {
                System.out.println("请输入要注册的密码：");
                String password = sc.next();
                System.out.println("请再次输入要注册的密码：");
                String confirm = sc.next();
                if (password.equals(confirm)) {
                    System.out.println("请输入居民身份证号码：");
                    String IDnum = sc.next();
                    if (checkIDNum(IDnum)) {
                        System.out.println("请输入手机号");
                        String phoneNum = sc.next();
                        if (checkPhoneNum(phoneNum)) {
                            System.out.println("注册成功！");
                            user.setUsername(username);
                            user.setPassword(password);
                            user.setIDnum(IDnum);
                            user.setPhonenum(phoneNum);
                            list.add(user);
                            break;
                        } else {
                            System.out.println("请输入正确的手机号！");
                        }
                    } else {
                        System.out.println("请输入有效的身份证号码！");
                    }
                } else {
                    System.out.println("密码不一致！");
                }
            } else {
                System.out.println("请重新输入！");
            }
        }

    }

    public static boolean checkUsername(ArrayList<User> userList, String username) {

        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getUsername().equals(username)) {
                System.out.println("用户名已存在！");
                return false;
            }
        }

        boolean flag = false;
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度超出范围！");
            return false;
        } else {
            for (int i = 0; i < username.length(); i++) {

                char c = username.charAt(i);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    flag = true;
                }
                if (c < '0' || c > 'z' || c > '9' && c < 'A' || c > 'Z' && c < 'a') {
                    return false;
                }
            }
        }
        return flag;
    }

    public static boolean checkIDNum(String IDnum) {
        if (IDnum.length() != 18) return false;
        if (IDnum.charAt(0) == '0') return false;
        for (int i = 0; i < IDnum.length() - 1; i++) {
            char c = IDnum.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        char c17=IDnum.charAt(17);
        return c17 >= '0' && c17 <= '9' || c17 == 'x' || c17 == 'X';
    }

    public static boolean checkPhoneNum(String phoneNum) {
        if (phoneNum.length() != 11) return false;
        if (phoneNum.charAt(0) == '0') return false;
        for (int i = 0; i < phoneNum.length(); i++) {
            char c = phoneNum.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }

    public static void forgetPassword(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String username = sc.next();
        int index=findUserIndex(list, username);
        if (index<0) {
            System.out.println("用户名未注册！");
        } else {
            User user=list.get(index);
            System.out.println("请输入注册的身份证号码：");
            String IDnum=sc.next();
            System.out.println("请输入注册的手机号码：");
            String phoneNum=sc.next();
            if (user.getIDnum().equals(IDnum)&&user.getPhonenum().equals(phoneNum)){
                System.out.println("请输入新的密码：");
                String password=sc.next();
                user.setPassword(password);
                System.out.println("密码修改成功！");
            }
            else {
                System.out.println("账号信息不匹配，修改失败！");
            }
        }
    }

    public static int findUserIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
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

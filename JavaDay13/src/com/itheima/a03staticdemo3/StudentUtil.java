package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> list) {
        int max = 0;
        int age;
        for (int i = 0; i < list.size(); i++) {
            age = list.get(i).getAge();
            if (age > max) max = age;
        }
        return max;
    }
}

package com.itheima.b01oopextendsdemo1;

public class Husky extends Dog {

    public Husky() {
    }

    public Husky(String name, int age, String color, String bark) {
        super(name, age, color, bark);
    }

    public void destroy() {
        System.out.println("拆家");
    }
}

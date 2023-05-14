package com.itheima.b01oopextendsdemo1;

public class Teddy extends Dog {

    public Teddy() {
    }

    public Teddy(String name, int age, String color, String bark) {
        super(name, age, color, bark);
    }

    public void rub() {
        System.out.println("蹭蹭");
    }
}

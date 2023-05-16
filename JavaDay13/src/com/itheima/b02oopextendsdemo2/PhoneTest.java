package com.itheima.b02oopextendsdemo2;

public class PhoneTest {

    public static void main(String[] args) {

        Phone phone=new Phone();

        System.out.println(Phone.size);
        phone.call();
        phone.sendMessage();
        phone.playGame();
    }
}

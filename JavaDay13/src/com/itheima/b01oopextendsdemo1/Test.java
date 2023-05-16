package com.itheima.b01oopextendsdemo1;

public class Test {

    public static void main(String[] args) {

        Dog d=new Dog("旺财",2,"黑色","嗷呜~~");
        System.out.println(d.getName()+" "+d.getAge()+" "+d.getColor()+" "+d.getBark());

        Cat c=new Cat("中华田园猫",3,"黄色");
        System.out.println(c.getName()+" "+c.getAge()+" "+c.getColor());
        c.cry();

        Husky h= new Husky();
        h.cry();
    }
}

package com.itheima.b03oopextendsdemo3;

public class Test {

    public static void main(String[] args) {

        Person p=new Person("小北",21);
        Dog d=new Dog(4,"黑");
        Cat c=new Cat(3,"白");

        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼干");
    }
}

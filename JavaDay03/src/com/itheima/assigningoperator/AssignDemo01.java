package com.itheima.assigningoperator;

public class AssignDemo01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a+=b;
        //等同于a=(int)(a+b);
        System.out.println(a);
        System.out.println(b);

        //赋值运算符隐含强制类型转换
        short s=1;
        s+=1;
        //等同于 s=(short)(s+1);
        System.out.println(s);//2
    }
}

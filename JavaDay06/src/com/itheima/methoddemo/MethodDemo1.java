package com.itheima.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //最简单的方法调用
        playGame();
        playGame();
    }
    public static void playGame(){
        System.out.println("方法已经被调用！");
    }
}

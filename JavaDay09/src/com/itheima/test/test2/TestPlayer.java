package com.itheima.test.test2;

public class TestPlayer {

    public static void main(String[] args) {

        Player player1 = new Player("乔峰",100, '男');
        Player player2 = new Player("鸠摩智", 100,'男');

        player1.showInfo();
        player2.showInfo();

        while (true) {
            if (player1.getHealth() > 0&&player2.getHealth() > 0) player1.hit(player2);else break;
            if (player2.getHealth() > 0) player2.hit(player1);else break;
        }
    }
}

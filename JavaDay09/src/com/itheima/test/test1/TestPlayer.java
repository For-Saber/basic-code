package com.itheima.test.test1;

public class TestPlayer {

    public static void main(String[] args) {

        Player player1 = new Player("乔峰", 100);
        Player player2 = new Player("鸠摩智", 100);

        while (true) {
            if (player1.getHealth() > 0&&player2.getHealth() > 0) player1.hit(player2);else break;
            if (player2.getHealth() > 0) player2.hit(player1);else break;
        }
    }
}

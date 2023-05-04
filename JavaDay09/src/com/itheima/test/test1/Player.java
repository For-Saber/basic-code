package com.itheima.test.test1;

import java.util.Random;

public class Player {

    private String playername;
    private int health;

    public Player() {
    }

    public Player(String playername, int health) {
        this.playername = playername;
        setHealth(health);
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public void setHealth(int health) {
        if (health >= 0)
            this.health = health;
        else System.out.println("生命值不能为负！");
    }

    public String getPlayername() {
        return playername;
    }

    public int getHealth() {
        return health;
    }

    public void hit(Player player) {

        Random r = new Random();
        int damage = r.nextInt(20) + 1;
//        int remainHealth= player.getHealth()-damage;
//        remainHealth=remainHealth<0?0:remainHealth;//非负判定

        if (player.getHealth() <= damage) {
            System.out.print(this.getPlayername() + "挥起拳头打了" + player.getPlayername() + "一下，造成了" + player.getHealth() + "点伤害，");
            player.setHealth(0);
            System.out.println(this.getPlayername() + "K.O.了" + player.playername);
        } else {
            player.setHealth(player.getHealth() - damage);
            System.out.print(this.getPlayername() + "挥起拳头打了" + player.getPlayername() + "一下，造成了" + damage + "点伤害，");
            System.out.println(player.getPlayername()+"还剩"+player.getHealth()+"点生命值");
        }
    }

}

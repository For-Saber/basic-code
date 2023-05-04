package com.itheima.test.test2;

import java.util.Random;

public class Player {

    private String playername;
    private int health;
    private char gender;
    private String charm;

    //男生长相数组
    String[] boycharm = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    //女生长相数组
    String[] girlcharm = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"};

    //injured 受伤描述：
    String[] injure_desc = {
            "结果%s退了半步，毫发无损",//95
            "结果给%s造成一处瘀伤",//90
            "结果一击命中，%s痛得弯下腰",//80
            "结果%s痛苦地闷哼了一声，显然受了点内伤",//70
            "结果%s摇摇晃晃，一跤摔倒在地",//50
            "结果%s脸色一下变得惨白，连退了好几步",//30
            "结果『轰』的一声，%s口中鲜血狂喷而出",//10
            "结果%s一声惨叫，像滩软泥般塌了下去"};//0

    public Player() {
    }

    public Player(String playername, int health, char gender) {
        this.playername = playername;
        this.gender = gender;
        setHealth(health);
        setCharm(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCharm() {
        return charm;
    }

    public void setCharm(char gender) {

        Random r = new Random();
        int index = r.nextInt(boycharm.length);
        if (gender == '男') {
            this.charm = boycharm[index];
        } else if (gender == '女') {
            this.charm = girlcharm[index];
        } else this.charm = "奇形怪状";
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

    public void showInfo() {
        System.out.println("角色名：" + getPlayername());
        System.out.println("生命值：" + getHealth());
        System.out.println("角色性别：" + getGender());
        System.out.println("角色长相：" + getCharm());
        System.out.println();
    }

    public void hit(Player player) {

        Random r = new Random();
        int index = r.nextInt(6);
        String attacktpye = attacks_desc[index];
        System.out.printf(attacktpye, this.getPlayername(), player.getPlayername());
        System.out.println();

        int damage = r.nextInt(20) + 1;
        int remains = player.getHealth() - damage;
        remains = remains < 0 ? 0 : remains;//非负判定
        String injuretype;

        if (remains >= 95) {
            injuretype = injure_desc[0];
        } else if (remains >= 90) {
            injuretype = injure_desc[1];
        } else if (remains >= 80) {
            injuretype = injure_desc[2];
        } else if (remains >= 70) {
            injuretype = injure_desc[3];
        } else if (remains >= 50) {
            injuretype = injure_desc[4];
        } else if (remains >= 20) {
            injuretype = injure_desc[5];
        } else if (remains > 0) {
            injuretype = injure_desc[6];
        } else {
            injuretype = injure_desc[7];
        }

        player.setHealth(remains);
        System.out.printf(injuretype, player.getPlayername());
        System.out.println();

        if (remains == 0) System.out.println(this.getPlayername() + "K.O.了" + player.getPlayername());
    }

}

package com.company;

public class Hero {
    private int health;
    private int damage;
    private String attackType;

    public Hero() {
        System.out.println(this);
    }

    public int getHealth() {
        return this.health;
    }
    public int getDamage(){
         return this.damage;
    }
    public String getAttackType (){
        return this.attackType;
    }

    Hero(int health, int damage, String attackType) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;

    }
}
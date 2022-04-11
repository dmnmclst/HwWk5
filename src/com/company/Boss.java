package com.company;

public class Boss {
    private int Health;
    private int Damage;
    private String defenceType;


    public void setHealth(int health){
        this.Health = health;
    }
    public void setDamage (int damage){
        this.Damage = damage;
    }
    public void setDefenceType (String defenceType){
        this.defenceType = defenceType;
    }

    public int getHealth(){
        return this.Health;
    }

    public int getDamage(){
        return this.Damage;
    }

    public String getDefenceType(){
        return this.defenceType;
    }

}


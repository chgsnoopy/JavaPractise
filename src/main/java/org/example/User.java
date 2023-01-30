package org.example;

import java.io.Serializable;

public class User implements Serializable {
    //名字
    private String name;
    //老师
    private Boss boss;

    public void setUserName(String name){
        this.name = name;
    }
    public void setBoss(Boss boss){
        this.boss = boss;
    }
    public String getUserName(){
       return name;
    }
    public Boss getBoss(){
        return boss;
    }
}

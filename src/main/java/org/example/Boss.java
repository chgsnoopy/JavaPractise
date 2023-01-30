package org.example;

import java.io.Serializable;

public class Boss implements Serializable {
    //老师姓名, edit directly
    private String BossName;
    public void setBossName(String name){
        BossName = name;
    }
    public String getBossName(){
        return BossName;
    }

}

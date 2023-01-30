package org.example;

public class Teacher implements Cloneable
{
    //老师姓名
    private String teacherName;
    void setTeacherName(String name){
        teacherName = name;
    }
    String getTeacherName(){
        return teacherName;
    }

    protected Teacher clone() throws CloneNotSupportedException{
        return (Teacher)super.clone();
    }
}


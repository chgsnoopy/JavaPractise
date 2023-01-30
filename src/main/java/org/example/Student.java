package org.example;

public class Student implements Cloneable{
    //名字
    private String name;
    //老师
    private Teacher teacher;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setTeacher(Object teacher){
        this.teacher = (Teacher)teacher;
    }
    Teacher getTeacher(){
        return this.teacher;
    }

    protected Student clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }
}

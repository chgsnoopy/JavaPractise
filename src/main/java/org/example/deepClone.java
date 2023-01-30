package org.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deepClone {
    public static void main(String[] args) throws Exception{
        //user1有一个teacher对象的属性
        Boss boss = new Boss();
        boss.setBossName("我是boss一号");
        User user1 = new User();
        user1.setUserName("我是user一号");
        user1.setBoss(boss);

//序列化写入到流里
//        ByteOutputStream bots=new ByteOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(bots);
//        oos.writeObject(user1);
        ByteArrayOutputStream bots = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bots);
        oos.writeObject(user1);

//反序列化成user2对象
//        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bots.toByteArray()));
//        User user2 = (User) ois.readObject();
//        user2.setName("我是user二号");
//        user2.getTeacher().setTeacherName("我是teacher二号");
          ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bots.toByteArray()));
        User user2 = (User) ois.readObject();
        user2.setUserName("我是user二号");
        user2.getBoss().setBossName("我是teacher二号");
//最后我们再打印user1的对象属性
        System.out.println("user1 的name"+user1.getUserName());
        System.out.println("user1 的techerName"+user1.getBoss().getBossName());

        System.out.println("user2 的name"+user2.getUserName());
        System.out.println("user2 的techerName"+user2.getBoss().getBossName());

        System.out.println("bots : " + bots.toString());
        System.out.println("ois : " + ois.toString());
//        System.out.println("oos : " + oos.toString());

    }
}

package org.example;

public class JavaPractise {
    public static void main(String[] args) throws Exception{
        // EDTI DIRECTLY JavaPractise.java
        // COMMIT01AAA
        //user1有一个teacher对象的属性
        Teacher teacher=new Teacher();
        teacher.setTeacherName("我是teacher一号");
        Student student1 = new Student();
        student1.setName("我是user一号");
        student1.setTeacher(teacher);

//对user1进行浅拷贝，再重新赋值其属性
        Student student2 = (Student)student1.clone();
        Teacher teacher2 = (Teacher)teacher.clone();
        student2.setName("我是user二号");
        teacher2.setTeacherName("我是teacher二号");
        student2.setTeacher(teacher2);
//        student2.getTeacher().setTeacherName("我是teacher二号");

//最后我们再打印user1的对象属性
        System.out.println("user1 的name"+student1.getName());
        System.out.println("user1 的techerName"+student1.getTeacher().getTeacherName());

        System.out.println("user2 的name"+student2.getName());
        System.out.println("user2 的techerName"+student2.getTeacher().getTeacherName());
    }
}



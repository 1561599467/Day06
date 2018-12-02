package Test01;

import java.util.ArrayList;

public class Test_1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(30, "周老师", "正在吃饭....");
        Teacher teacher1 = new Teacher(30, "周老师", "正在亢奋的讲着java面向对象的知识......");
        Student student = new Student("韩同学", 18, "正在吃饭....");
        Student student1 = new Student("韩同学", 18, "正在专心致志的听着java面向对象的知识......");
        System.out.println("年龄为"+teacher.getAge()+"的"+teacher.getName()+teacher.getContent());
        System.out.println("年龄为"+teacher1.getAge()+"的"+teacher1.getName()+teacher1.getContent());
        System.out.println("年龄为"+student.getAge()+"的"+student.getName()+student.getContent());
        System.out.println("年龄为"+student1.getAge()+"的"+student1.getName()+student1.getContent());

    }
}

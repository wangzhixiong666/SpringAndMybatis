package com.jnshu.SpringAndMybatis.Client;

import com.jnshu.SpringAndMybatis.Model.Student;
import com.jnshu.SpringAndMybatis.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("service");

        //插入数据
        Student student = new Student("舒克", 888, "web", 20180917, "修真院", "www.jnshu.com", "好好学习", "贝塔", "知乎", 20180917, 20180917);
        try {
            studentService.insertStudent(student);
            long a = student.getId();
            System.out.println(a);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("插入数据失败");
        }

        //删除数据
        Student student1 = new Student();
        student.setName("小王");
        try {
            Boolean result = studentService.deleteStudent(student1.getName());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //修改数据
        Student student2 = new Student();
        student2.setId(666666);
        student2.setSchool("IT修真院");
        try {
            Boolean result = studentService.updateStudent(student2);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //查询数据
        Student student3 = new Student();
        student3.setId(668668);
        try {
            System.out.println(studentService.findStudentById(student3.getId()));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("没有找到该数据");
        }

        //查询所有数据
        try {
            System.out.println(studentService.findAllStudent());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("查询数据失败");
        }
    }


}
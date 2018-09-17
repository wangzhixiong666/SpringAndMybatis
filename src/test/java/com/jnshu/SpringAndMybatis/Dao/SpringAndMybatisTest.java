package com.jnshu.SpringAndMybatis.Dao;

import com.jnshu.SpringAndMybatis.Model.Student;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAndMybatisTest {
    private ApplicationContext context;
    private static Logger logger = LoggerFactory.getLogger(SpringAndMybatisTest.class);

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }

    @Test
    public void insertStudent() {
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        Student student = new Student("玉皇大帝", 123, "ui", 20180911, "天宫", "http://www.jnshu.com", "我最牛", "李伟明", "无字天书", 12181818, 5144);
        System.out.println(studentMapper.insertStudent(student));
    }

    @Test
    public void deleteStudent() {
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        Student student = new Student();
        student.setName("孙悟空");
        studentMapper.deleteStudent(student.getName());
    }

    @Test
    public void updateStudent() {
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        Student student = new Student();
        student.setSchool("厦门大学");
        student.setId(1);
        studentMapper.updateStudent(student);
    }

    @Test
    public void findStudentById() {
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        Student student = new Student();
        student.setId(4844);
        System.out.println(studentMapper.findStudentById(student.getId()));
    }

    @Test
    public void findAllStudent() {
        StudentMapper studentMapper = (StudentMapper) context.getBean("studentMapper");
        System.out.println(studentMapper.findAllStudent());
    }
}
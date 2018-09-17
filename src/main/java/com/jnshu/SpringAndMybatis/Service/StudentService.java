package com.jnshu.SpringAndMybatis.Service;

import com.jnshu.SpringAndMybatis.Model.Student;

import java.util.List;

public interface StudentService {
    int insertStudent(Student student);

    boolean deleteStudent(String name);

    boolean updateStudent(Student student);

    Student findStudentById(long id);

    List <Student> findAllStudent();
}
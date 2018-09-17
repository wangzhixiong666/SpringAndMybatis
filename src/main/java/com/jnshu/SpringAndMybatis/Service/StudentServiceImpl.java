package com.jnshu.SpringAndMybatis.Service;

import com.jnshu.SpringAndMybatis.Dao.StudentMapper;
import com.jnshu.SpringAndMybatis.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public boolean deleteStudent(String name) {
        return studentMapper.deleteStudent(name);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student findStudentById(long id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public List <Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }
}
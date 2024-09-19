package com.demo.mybatis.services;

import com.demo.mybatis.mappers.StudentMapper;
import com.demo.mybatis.models.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentMapper studentMapper;

    public List<Student> findAll() {
        return studentMapper.findAllStudent();
    }

    public Student findById(Integer id) {
        return studentMapper.findStudentById(id);
    }

    public void save(Student student) {
        studentMapper.insertStudent(student);
    }

    public void update(Student student, Integer id) {
        studentMapper.updateStudent(student, id);
    }

    public void delete(Integer id) {
        studentMapper.deleteStudent(id);
    }
}

package com.demo.mybatis.mappers;

import com.demo.mybatis.models.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    //@Select("SELECT * FROM CFPC.Students")
    List<Student> findAllStudents();

    //@Select("SELECT * FROM CFPC.Students where id=#{id}")
    Student findStudentById(Integer id);

    //@Insert("INSERT INTO CFPC.Students(id, name, email) VALUES(#{id}, #{name}, #{email})")
    void insertStudent(Student student);

    //@Update("UPDATE CFPC.Students set name=#{student.name}, email=#{student.email} where id=#{id}")
    void updateStudent(Student student, Integer id);

    //@Delete("DELETE from CFPC.Students where id=#{id}")
    void deleteStudent(Integer id);

}

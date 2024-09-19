package com.demo.mybatis.controllers;

import com.demo.mybatis.models.Student;
import com.demo.mybatis.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.save(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable("id") Integer id){
        studentService.update(student, id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentService.delete(id);
    }

}

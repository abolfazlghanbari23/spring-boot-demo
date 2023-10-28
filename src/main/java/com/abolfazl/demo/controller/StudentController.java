package com.abolfazl.demo.controller;

import com.abolfazl.demo.model.Student;
import com.abolfazl.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
//@Deprecated
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "all")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    public void createNewStudent(@RequestBody Student student) {
        System.out.println("Post request...");
        System.out.println(student);
    }


    @PutMapping
    public void updateStudent(@RequestBody Student student) {
        System.out.println("Update request...");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        System.out.println("Delete request for id: " + id);
    }
}

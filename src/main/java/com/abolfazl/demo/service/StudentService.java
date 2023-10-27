package com.abolfazl.demo.service;

import com.abolfazl.demo.dao.StudentRepository;
import com.abolfazl.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudent(UUID sId) {
        return null;
    }

    public int updateStudent(Student student) {
        return 1;
    }

    public int insertStudent(UUID sid, Student student) {
        return 1;
    }

    public int removeStudent(UUID sid) {
        return 1;
    }
}

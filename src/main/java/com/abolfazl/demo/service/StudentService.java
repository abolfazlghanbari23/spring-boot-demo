package com.abolfazl.demo.service;

import com.abolfazl.demo.dao.StudentRepository;
import com.abolfazl.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Student getStudent(Long sId) {
        return studentRepository.getAllStudents()
                .stream()
                .filter(student -> student.getStudentId().equals(sId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("student with id: " + sId + " not found"));
    }

    public int updateStudent(Student student) {
        return 1;
    }

    public int insertStudent(Long sid, Student student) {
        return 1;
    }

    public int removeStudent(Long sid) {
        return 1;
    }
}

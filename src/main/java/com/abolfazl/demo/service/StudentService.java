package com.abolfazl.demo.service;

import com.abolfazl.demo.dao.StudentRepositoryImpl;
import com.abolfazl.demo.exception.NotFoundException;
import com.abolfazl.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepositoryImpl studentRepository;

    @Autowired
    public StudentService(StudentRepositoryImpl studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long sId) {
        return studentRepository.findById(sId)
                .orElseThrow(() -> new NotFoundException("student with id: " + sId + " not found"));
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

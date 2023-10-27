package com.abolfazl.demo.dao;

import com.abolfazl.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentRepository {
    List<Student> getAllStudents();

    Student getStudent(Long sId);

    int updateStudent(Student student);

    int insertStudent(Long sid, Student student);

    int removeStudent(Long sid);

}

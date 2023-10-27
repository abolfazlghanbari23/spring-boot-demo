package com.abolfazl.demo.dao;

import com.abolfazl.demo.model.Student;

import java.util.Collections;
import java.util.List;

public class FakeStudentRepository implements StudentRepository {
    @Override
    public List<Student> getAllStudents() {
        return Collections.emptyList();
    }

    @Override
    public Student getStudent(Long sId) {
        return null;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int insertStudent(Long sid, Student student) {
        return 0;
    }

    @Override
    public int removeStudent(Long sid) {
        return 0;
    }
}

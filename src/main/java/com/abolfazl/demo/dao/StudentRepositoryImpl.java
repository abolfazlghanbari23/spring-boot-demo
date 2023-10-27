package com.abolfazl.demo.dao;

import com.abolfazl.demo.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> database;

    static {
        database = new HashMap<>();
        database.put(1L, new Student(1L, "Ali", "Ahmadi", "a.ahmadi@gmail.com", Student.Gender.MALE));
        database.put(2L, new Student(2L, "Rostam", "Ghaderi", "r.ghaderi@gmail.com", Student.Gender.MALE));
        database.put(3L, new Student(3L, "Maryam", "Jalali", "m.jalali@yahoo.com", Student.Gender.FEMALE));
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Student getStudent(Long sId) {
        return database.get(sId);
    }

    @Override
    public int updateStudent(Student student) {
        database.put(student.getStudentId(), student);
        return 1;
    }

    @Override
    public int insertStudent(Long sid, Student student) {
        database.put(sid, student);
        return 1;
    }

    @Override
    public int removeStudent(Long sid) {
        database.remove(sid);
        return 1;
    }
}

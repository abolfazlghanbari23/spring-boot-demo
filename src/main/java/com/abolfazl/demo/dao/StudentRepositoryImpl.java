package com.abolfazl.demo.dao;

import com.abolfazl.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryImpl extends JpaRepository<Student, Long> {

}

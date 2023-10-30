package com.abolfazl.demo;

import com.abolfazl.demo.dao.FakeStudentRepository;
import com.abolfazl.demo.dao.StudentRepository;
import com.abolfazl.demo.dao.StudentRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Value("${app.useFakeStudentRepo:false}")
    private Boolean useFakeStudentRepo;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> System.out.println("commandLineRunner ok");
    }
}

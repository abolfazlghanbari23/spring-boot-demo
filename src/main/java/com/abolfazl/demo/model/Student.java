package com.abolfazl.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    private final Long studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(Long studentId, String firstName, String lastName, String email, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    @JsonIgnore
    public Long getStudentId() {
        return studentId;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public enum Gender {MALE, FEMALE}
}

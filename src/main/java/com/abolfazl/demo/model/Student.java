package com.abolfazl.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Student {

    @Id
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;
    @NotBlank(message = "lastName should not be empty")
    @Column(name = "last_name")
    private String lastName;
    @NotBlank(message = "email should not be empty")
    @Email(message = "wrong email")
    private String email;
    private Gender gender;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank(message = "password should not be empty")
    private String password;

    public Student(Long studentId, String password, String firstName, String lastName, String email, Gender gender) {
        this.studentId = studentId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Student() {
    }

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

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                '}';
    }

    public enum Gender {MALE, FEMALE}
}

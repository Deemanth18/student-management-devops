package com.example.student_management.service;

import com.example.student_management.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    // Add sample students
    public StudentService() {
        students.add(new Student(101, "Deemanth", "deemanth@gmail.com", "CSE AI&ML"));
        students.add(new Student(102, "Akash", "akash@gmail.com", "CSE AI&ML"));
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Add a new student
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }
}
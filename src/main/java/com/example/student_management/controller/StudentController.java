package com.example.student_management.controller;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;

    // Constructor injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET: Display all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // POST: Add a new student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // GET: Health check
    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of(
            "status", "UP",
            "message", "Student Management API is running"
        );
    }
}
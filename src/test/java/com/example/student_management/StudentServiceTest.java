package com.example.student_management;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService studentService = new StudentService();

    @Test
    void testGetAllStudents() {

        assertEquals(2, studentService.getAllStudents().size());
    }

    @Test
    void testAddStudent() {

        Student student = new Student(
                103,
                "Harsha",
                "harsha@gmail.com",
                "CSE AI&ML"
        );

        Student result = studentService.addStudent(student);

        assertNotNull(result);
        assertEquals("Harsha", result.getName());
        assertEquals(3, studentService.getAllStudents().size());
    }
}
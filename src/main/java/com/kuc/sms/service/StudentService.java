package com.kuc.sms.service;

import com.kuc.sms.entity.Student;
import org.springframework.ui.Model;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    void readStudentByIdToModel(Long id, Model model);
}

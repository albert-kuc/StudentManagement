package com.kuc.sms.service.impl;

import com.kuc.sms.entity.Student;
import com.kuc.sms.repository.StudentRepository;
import com.kuc.sms.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void readStudentByIdToModel(Long id, Model model) {
        model.addAttribute("student", studentRepository.getById(id));
    }

    @Override
    public Student replaceStudentDetails(Long studentId, Student newStudentDetails) {

        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new EntityNotFoundException("Student not found for this id :: " + studentId));

        existingStudent.setId(newStudentDetails.getId());
        existingStudent.setFirstName(newStudentDetails.getFirstName());
        existingStudent.setLastName(newStudentDetails.getLastName());
        existingStudent.setEmail(newStudentDetails.getEmail());

        return studentRepository.save(existingStudent);
    }
}

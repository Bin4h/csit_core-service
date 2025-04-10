package com.core_service.core_service.controller;

import com.core_service.core_service.dtos.StudentDto;
import com.core_service.core_service.data.StudentRepository;
import com.core_service.core_service.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @GetMapping("/get")
    public final List<Student> getIStudents () {
        return studentRepository.findAll();
    }

    @PutMapping("/post")
    public final String createStudent (@RequestBody StudentDto model) {
        var student = new Student();
        student.name = model.name();
        student.email = model.email();
        studentRepository.save(student);
        return "OK";
    }
    @PatchMapping("/put/{id}")
    public final String updateStudent (@PathVariable int id, @RequestBody StudentDto model) {
        var stud = studentRepository.findById(id);
        if (stud.isEmpty()) {
            return "Error";
        }
        var student = stud.get();
        if (model.name() != null) {
            student.name = model.name();
        }
        if (model.email() != null) {
            student.email = model.email();
        }
        studentRepository.save(student);
        return "OK";
    }
    @DeleteMapping("/delete/{id}")
    public final String deleteStudent (@PathVariable int id) {
        studentRepository.deleteById(id);
        return "OK";
    }
}

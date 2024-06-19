package org.example.intership.manytomany.service.studentservice;

import org.example.intership.manytomany.dto.StudentDto;
import org.example.intership.manytomany.entity.Student;
import org.example.intership.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetStudent {
    @Autowired
    StudentRepository studentRepository;

    public StudentDto getStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow();
        StudentDto studentDto = new StudentDto(student.getName(), student.getAge());
        return studentDto;
    }

}
